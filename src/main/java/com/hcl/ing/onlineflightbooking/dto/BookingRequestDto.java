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
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getFlightTravelDetailsId() {
		return flightTravelDetailsId;
	}
	public void setFlightTravelDetailsId(Long flightTravelDetailsId) {
		this.flightTravelDetailsId = flightTravelDetailsId;
	}
	public List<Passangers> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passangers> passengers) {
		this.passengers = passengers;
	}
	
	
}
