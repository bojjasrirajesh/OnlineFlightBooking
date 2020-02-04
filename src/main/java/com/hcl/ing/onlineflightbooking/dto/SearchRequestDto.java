package com.hcl.ing.onlineflightbooking.dto;

import java.io.Serializable;


public class SearchRequestDto implements Serializable{
	private static final long serialVersionUID = 1L;
	private String fromLocation;
	private String toLocation;
	private String travelDate;
	

	public String getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}