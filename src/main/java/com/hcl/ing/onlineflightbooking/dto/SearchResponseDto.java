package com.hcl.ing.onlineflightbooking.dto;

import java.io.Serializable;
import java.util.List;

import com.hcl.ing.onlineflightbooking.entity.FlightTravelDetails;

public class SearchResponseDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private Integer statusCode;
	private List<FlightTravelDetails> flightTravelDetails;
	private String flightName;
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public List<FlightTravelDetails> getFlightTravelDetails() {
		return flightTravelDetails;
	}
	public void setFlightTravelDetails(List<FlightTravelDetails> flightTravelDetails) {
		this.flightTravelDetails = flightTravelDetails;
	}
	
	
	
	
}
