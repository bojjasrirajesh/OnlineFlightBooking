package com.hcl.ing.onlineflightbooking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "flights")
public class Flights {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long flightId;
	private String flightName;
	private String flightNumber;
	private Integer businessClassSeats;
	private Integer economyClassSeats;
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public Integer getBusinessClassSeats() {
		return businessClassSeats;
	}
	public void setBusinessClassSeats(Integer businessClassSeats) {
		this.businessClassSeats = businessClassSeats;
	}
	public Integer getEconomyClassSeats() {
		return economyClassSeats;
	}
	public void setEconomyClassSeats(Integer economyClassSeats) {
		this.economyClassSeats = economyClassSeats;
	}
	@Override
	public String toString() {
		return "Flights [flightId=" + flightId + ", flightName=" + flightName + ", flightNumber=" + flightNumber
				+ ", businessClassSeats=" + businessClassSeats + ", economyClassSeats=" + economyClassSeats + "]";
	}
	public Flights(Long flightId, String flightName, String flightNumber, Integer businessClassSeats,
			Integer economyClassSeats) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.flightNumber = flightNumber;
		this.businessClassSeats = businessClassSeats;
		this.economyClassSeats = economyClassSeats;
	}
	
}
