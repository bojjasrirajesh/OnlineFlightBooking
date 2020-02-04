package com.hcl.ing.onlineflightbooking.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class Bookings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
