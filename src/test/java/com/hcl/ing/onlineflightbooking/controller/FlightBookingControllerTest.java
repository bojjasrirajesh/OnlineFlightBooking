package com.hcl.ing.onlineflightbooking.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.hcl.ing.onlineflightbooking.dto.BookingRequestDto;
import com.hcl.ing.onlineflightbooking.dto.BookingResponseDto;
import com.hcl.ing.onlineflightbooking.entity.Passangers;
import com.hcl.ing.onlineflightbooking.exception.NoSeatAvaliableException;
import com.hcl.ing.onlineflightbooking.exception.NoUserDataAvaliableException;
import com.hcl.ing.onlineflightbooking.exception.SufficientSeatNotAvaliableException;
import com.hcl.ing.onlineflightbooking.service.FlightBookingService;

@RunWith(MockitoJUnitRunner.Silent.class)
public class FlightBookingControllerTest {
	

	BookingRequestDto bookingRequestDtos= null;
	BookingResponseDto bookingResponseDto= null;
	List<Passangers> passangars =null;
	Passangers passangers = null;
	Passangers passangers1= null;
	Passangers passangers2= null;
	
	@InjectMocks
	FlightBookingController filghtBookingController;
	
	@Mock
	FlightBookingService flightBookingService;
	
	@Before
	public void before() 
		{
		bookingRequestDtos=	new BookingRequestDto();
		bookingResponseDto=	new BookingResponseDto();
		bookingRequestDtos.setFlightTravelDetailsId(1L);
		bookingRequestDtos.setUserId(1L);
	    passangars = new ArrayList<Passangers>();
	    passangers = new Passangers();
		passangers.setPassangerId(1L);
		passangers1 = new Passangers();
		passangers2 = new Passangers();
		passangers.setMobileNo("89545464666");
		passangers.setPassangerName("Ram");
		passangers1.setPassangerId(2L);
		passangers1.setMobileNo("76644335585");
		passangers1.setPassangerName("Kumar");
		passangers2.setPassangerId(3L);
		passangers2.setMobileNo("8565322675");
		passangers2.setPassangerName("Raja");
		passangars.add(passangers);
		passangars.add(passangers1);
		passangars.add(passangers2);
		bookingRequestDtos.setPassengers(passangars);	
		bookingResponseDto.setBookingId(1L);
		bookingResponseDto.setFlightTravelDetailsId(bookingRequestDtos.getFlightTravelDetailsId());
		bookingResponseDto.setStatus("Success");
		bookingResponseDto.setUserId(bookingRequestDtos.getUserId());
		}

	@Test
	public void testFlightBookingPositive()
	  throws  NoSeatAvaliableException, NoUserDataAvaliableException, SufficientSeatNotAvaliableException {
		Mockito.when(flightBookingService.bookFlight(bookingRequestDtos)).thenReturn(bookingResponseDto);
		ResponseEntity<BookingResponseDto> bookingResponseDto = filghtBookingController.ticketBooking(bookingRequestDtos);
		assertEquals(bookingResponseDto.getBody().getStatus(), "Success");
	}
	
	

}
