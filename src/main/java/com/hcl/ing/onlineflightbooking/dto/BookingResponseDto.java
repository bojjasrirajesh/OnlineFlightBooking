package com.hcl.ing.onlineflightbooking.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingResponseDto {
	private Long bookingId;
	private Long userId;
	private Long flightTravelDetailsId;
	private String status;

}
