package com.hcl.ing.onlineflightbooking.service;

import com.hcl.ing.onlineflightbooking.dto.BookingRequestDto;
import com.hcl.ing.onlineflightbooking.dto.BookingResponseDto;
import com.hcl.ing.onlineflightbooking.exception.NoSeatAvaliableException;
import com.hcl.ing.onlineflightbooking.exception.NoUserDataAvaliableException;
import com.hcl.ing.onlineflightbooking.exception.SufficientSeatNotAvaliableException;


public interface FlightBookingService {
	
	public BookingResponseDto bookFlight(BookingRequestDto bookingRequestDto) throws NoSeatAvaliableException, NoUserDataAvaliableException, SufficientSeatNotAvaliableException;

}
