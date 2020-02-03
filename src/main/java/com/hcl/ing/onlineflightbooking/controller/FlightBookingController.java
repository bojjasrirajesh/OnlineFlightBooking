package com.hcl.ing.onlineflightbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.onlineflightbooking.dto.BookingRequestDto;
import com.hcl.ing.onlineflightbooking.dto.BookingResponseDto;
import com.hcl.ing.onlineflightbooking.exception.NoSeatAvaliableException;
import com.hcl.ing.onlineflightbooking.exception.NoUserDataAvaliableException;
import com.hcl.ing.onlineflightbooking.service.FlightBookingService;

import lombok.extern.slf4j.Slf4j;

/*
 *  @author Shankar 
 * 
 * Method is used for manager functions that includes his login,
 * getting list of resources and viewing the resources based on their skill 
 * and getting their count
 * 
 */

@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RestController
@Slf4j
public class FlightBookingController {
	
	@Autowired
	FlightBookingService flightBookingService;
	
	@PostMapping("/ticketBooking/")
	public BookingResponseDto ticketBooking(BookingRequestDto bookingRequestDto) throws NoSeatAvaliableException, NoUserDataAvaliableException
	{
		
		BookingResponseDto bookingResponseDto=	flightBookingService.bookFlight(bookingRequestDto);
		return null;
	}

}
