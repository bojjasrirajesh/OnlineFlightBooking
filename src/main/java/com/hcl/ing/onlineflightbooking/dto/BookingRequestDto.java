package com.hcl.ing.onlineflightbooking.dto;

import java.util.List;

import com.hcl.ing.onlineflightbooking.entity.Passangers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingRequestDto {
	private Long userId;
	private Long flightTravelDetailsId;
	private List<Passangers> passengers;
	
}
