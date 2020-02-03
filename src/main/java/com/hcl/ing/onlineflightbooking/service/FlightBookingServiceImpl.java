package com.hcl.ing.onlineflightbooking.service;

import java.util.Objects;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hcl.ing.onlineflightbooking.dto.BookingRequestDto;
import com.hcl.ing.onlineflightbooking.dto.BookingResponseDto;
import com.hcl.ing.onlineflightbooking.entity.Bookings;
import com.hcl.ing.onlineflightbooking.entity.Passangers;
import com.hcl.ing.onlineflightbooking.exception.NoSeatAvaliableException;
import com.hcl.ing.onlineflightbooking.exception.NoUserDataAvaliableException;
import com.hcl.ing.onlineflightbooking.repository.BookingRepository;
import com.hcl.ing.onlineflightbooking.repository.FlightTravelDetailsRepository;
import com.hcl.ing.onlineflightbooking.repository.PassangerRepository;
import com.hcl.ing.onlineflightbooking.util.LibraryUtil;

@Service
public class FlightBookingServiceImpl implements FlightBookingService {

	@Autowired 
	FlightTravelDetailsRepository flightTravelDetailsRepository;
	
	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	PassangerRepository passangerRepository;

	@Override
	public BookingResponseDto bookFlight(BookingRequestDto bookingRequestDto) throws NoUserDataAvaliableException,NoSeatAvaliableException {
		
		if (Objects.isNull(bookingRequestDto)) 
			{
			throw new NoUserDataAvaliableException(LibraryUtil.NOT_AVAILABLE);	
		}
		Integer seat=flightTravelDetailsRepository.findByFlightTravelDetailsId(bookingRequestDto.getFlightTravelDetailsId());
		
		if(bookingRequestDto.getPassengers().size()>seat)
		{
			throw new NoSeatAvaliableException(LibraryUtil.NO_SEAT_AVAILABLE);
		}
		Bookings booking= new Bookings();
		booking.setFlightTravelDetailsId(bookingRequestDto.getFlightTravelDetailsId());
		booking.setStatus("Success");
		booking.setUserId(bookingRequestDto.getUserId());
		bookingRepository.save(booking);
   int i=0;
		for(Passangers passangers:bookingRequestDto.getPassengers())
		{
			passangers.setBookingId(bookingRequestDto.getPassengers().get(i).getBookingId());
			passangers.setMobileNo(bookingRequestDto.getPassengers().get(i).getMobileNo());
			passangers.setPassangerName(bookingRequestDto.getPassengers().get(i).getPassangerName());
			passangerRepository.save(passangers);
		i++;	
		}
		
		BookingResponseDto bookingResponseDto= new BookingResponseDto();
		bookingResponseDto.setBookingId(bookingId);
		return null;
	}

}
