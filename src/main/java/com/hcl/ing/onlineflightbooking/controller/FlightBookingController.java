package com.hcl.ing.onlineflightbooking.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hcl.ing.onlineflightbooking.dto.BookingRequestDto;
import com.hcl.ing.onlineflightbooking.dto.BookingResponseDto;
import com.hcl.ing.onlineflightbooking.entity.Bookings;
import com.hcl.ing.onlineflightbooking.entity.Passangers;
import com.hcl.ing.onlineflightbooking.exception.NoSeatAvaliableException;
import com.hcl.ing.onlineflightbooking.exception.NoUserDataAvaliableException;
import com.hcl.ing.onlineflightbooking.exception.SufficientSeatNotAvaliableException;
import com.hcl.ing.onlineflightbooking.service.FlightBookingService;

import lombok.extern.slf4j.Slf4j;

/*
 *  @author Shankar 
 * 
 * this Method is used to book the flight ticket  
 * 
 */

@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RestController
@Slf4j
public class FlightBookingController {

	private static final Logger log = LoggerFactory.getLogger(LocationsController.class);
	/**
	 * @author Shankar
	 * 
	 * Method is used for to book the flight ticket
	 * 
	 * @param BookingRequestDto
	 * @return BookingResponseDto
	 * @throws NoSeatAvaliableException
	 * @throws NoUserDataAvaliableException
	 */

	@Autowired
	FlightBookingService flightBookingService;

	@PostMapping("/ticketBooking")
	public ResponseEntity<BookingResponseDto> ticketBooking(BookingRequestDto bookingRequestDto)
			throws NoSeatAvaliableException, NoUserDataAvaliableException, SufficientSeatNotAvaliableException {
		log.info("Passing Manual Input Data to check Ticket Booking");
		BookingRequestDto bookingRequestDtos = new BookingRequestDto();
		bookingRequestDtos.setFlightTravelDetailsId(1L);
		bookingRequestDtos.setUserId(1L);
		List<Passangers> passangars = new ArrayList<Passangers>();
		Passangers passangers = new Passangers();
		Passangers passangers1 = new Passangers();
		Passangers passangers2 = new Passangers();
		passangers.setMobileNo("89545464666");
		passangers.setPassangerName("Ram");
		passangers1.setMobileNo("76644335585");
		passangers1.setPassangerName("Kumar");
		passangers2.setMobileNo("8565322675");
		passangers2.setPassangerName("Raja");
		passangars.add(passangers);
		passangars.add(passangers1);
		passangars.add(passangers2);
		bookingRequestDtos.setPassengers(passangars);
		BookingResponseDto bookingResponseDtoss = flightBookingService.bookFlight(bookingRequestDto);

		return new ResponseEntity<>(bookingResponseDtoss, HttpStatus.OK);
	}

}
