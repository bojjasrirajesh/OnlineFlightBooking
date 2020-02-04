package com.hcl.ing.onlineflightbooking.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flighttraveldetails")
public class FlightTravelDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long flightTravelDetailsId;
	private Long flightId;
	private String fromLocation;
	private String toLocation;
	private LocalDateTime departureDateTime;
	private LocalDateTime arrivalDateTime;
	private Integer businessClassPrice;
	private Integer economyClassPrice;
	private Integer seatAvailability;
	private LocalDateTime travelDate;
	
	public Long getFlightTravelDetailsId() {
		return flightTravelDetailsId;
	}
	public void setFlightTravelDetailsId(Long flightTravelDetailsId) {
		this.flightTravelDetailsId = flightTravelDetailsId;
	}
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public LocalDateTime getDepartureDateTime() {
		return departureDateTime;
	}
	public void setDepartureDateTime(LocalDateTime departureDateTime) {
		this.departureDateTime = departureDateTime;
	}
	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}
	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}
	public Integer getBusinessClassPrice() {
		return businessClassPrice;
	}
	public void setBusinessClassPrice(Integer businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}
	public Integer getEconomyClassPrice() {
		return economyClassPrice;
	}
	public void setEconomyClassPrice(Integer economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}
	public Integer getSeatAvailability() {
		return seatAvailability;
	}
	public void setSeatAvailability(Integer seatAvailability) {
		this.seatAvailability = seatAvailability;
	}
	public LocalDateTime getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(LocalDateTime travelDate) {
		this.travelDate = travelDate;
	}
}
