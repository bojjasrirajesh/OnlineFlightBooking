package com.hcl.ing.onlineflightbooking.service;

import java.util.List;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hcl.ing.onlineflightbooking.dto.BookingRequestDto;
import com.hcl.ing.onlineflightbooking.dto.BookingResponseDto;
import com.hcl.ing.onlineflightbooking.entity.Bookings;
import com.hcl.ing.onlineflightbooking.entity.FlightTravelDetails;
import com.hcl.ing.onlineflightbooking.entity.Passangers;
import com.hcl.ing.onlineflightbooking.exception.NoSeatAvaliableException;
import com.hcl.ing.onlineflightbooking.exception.NoUserDataAvaliableException;
import com.hcl.ing.onlineflightbooking.exception.SufficientSeatNotAvaliableException;
import com.hcl.ing.onlineflightbooking.repository.BookingRepository;
import com.hcl.ing.onlineflightbooking.repository.FlightTravelDetailsRepository;
import com.hcl.ing.onlineflightbooking.repository.PassangerRepository;
import com.hcl.ing.onlineflightbooking.util.LibraryUtil;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FlightBookingServiceImpl implements FlightBookingService {

	@Autowired
	FlightTravelDetailsRepository flightTravelDetailsRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	PassangerRepository passangerRepository;

	

	/**
	 * @author Shankar
	 * Method is used to book the online flight ticket ticket
	 * @param bookingRequestDto
	 * @return BookingResponseDto
	 */
	@Override
	public BookingResponseDto bookFlight(BookingRequestDto bookingRequestDto)
			throws NoUserDataAvaliableException, NoSeatAvaliableException, SufficientSeatNotAvaliableException {

		if (Objects.isNull(bookingRequestDto)) {
			log.info("For checking whether the Booking Passenger Data is There or not");
			throw new NoUserDataAvaliableException(LibraryUtil.NOT_AVAILABLE);
		}
		int seat = flightTravelDetailsRepository
				.findByFlightTravelDetailsId(bookingRequestDto.getFlightTravelDetailsId());
		if (seat == 0) {
			log.info("For checking whether the Seat is Avaliable or Not");
			throw new NoSeatAvaliableException(LibraryUtil.NO_SEAT_AVAILABLE);
		}
		if ((bookingRequestDto.getPassengers().size()) > seat) {
			log.info("For checking whether the Sufficient Seat is Avaliable or Not");
			throw new SufficientSeatNotAvaliableException(LibraryUtil.EFFICIENT_SEAT_NOT_AVAILABLE);
		}
		Bookings booking = new Bookings();
		FlightTravelDetails flightTravelDetails = flightTravelDetailsRepository
				.findById(bookingRequestDto.getFlightTravelDetailsId()).get();
		flightTravelDetails.setSeatAvailability(seat - bookingRequestDto.getPassengers().size());
		flightTravelDetailsRepository.save(flightTravelDetails);
		booking.setFlightTravelDetailsId(bookingRequestDto.getFlightTravelDetailsId());
		booking.setStatus("Success");
		booking.setUserId(bookingRequestDto.getUserId());
		List<Passangers> passengers = bookingRequestDto.getPassengers();
		for (Passangers passangers : passengers) {
			log.info("Getting Passangers Details and Store into Database");
			passangers.setPassangerId(1L);
			passangers.setMobileNo(passangers.getMobileNo());
			passangers.setPassangerName(passangers.getPassangerName());
			passangerRepository.save(passangers);
		}
		bookingRepository.save(booking);
		BookingResponseDto bookingResponseDto = new BookingResponseDto();
		bookingResponseDto.setBookingId(booking.getBookingId());
		bookingResponseDto.setFlightTravelDetailsId(bookingRequestDto.getFlightTravelDetailsId());
		bookingResponseDto.setStatus("Success");
		bookingResponseDto.setUserId(bookingRequestDto.getUserId());
		return bookingResponseDto;
	}

}
