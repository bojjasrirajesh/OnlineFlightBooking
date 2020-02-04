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
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
