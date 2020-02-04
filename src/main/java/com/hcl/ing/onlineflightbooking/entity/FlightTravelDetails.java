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
	private String travelDate;
	private String flightName;
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
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
	@Override
	public String toString() {
		return "FlightTravelDetails [flightTravelDetailsId=" + flightTravelDetailsId + ", flightId=" + flightId
				+ ", fromLocation=" + fromLocation + ", toLocation=" + toLocation + ", departureDateTime="
				+ departureDateTime + ", arrivalDateTime=" + arrivalDateTime + ", businessClassPrice="
				+ businessClassPrice + ", economyClassPrice=" + economyClassPrice + ", seatAvailability="
				+ seatAvailability + ", travelDate=" + travelDate + ", flightName=" + flightName + "]";
	}
	public FlightTravelDetails(Long flightTravelDetailsId, Long flightId, String fromLocation, String toLocation,
			LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, Integer businessClassPrice,
			Integer economyClassPrice, Integer seatAvailability,String travelDate,String flightName) {
		super();
		this.flightTravelDetailsId = flightTravelDetailsId;
		this.flightId = flightId;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureDateTime = departureDateTime;
		this.arrivalDateTime = arrivalDateTime;
		this.businessClassPrice = businessClassPrice;
		this.economyClassPrice = economyClassPrice;
		this.seatAvailability = seatAvailability;
		this.travelDate=travelDate;
		this.flightName=flightName;
	}
	public FlightTravelDetails() {
		super();
	}
	
	
	
	

}
