package com.hcl.ing.onlineflightbooking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Locations {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long locationId;
	private String locaionName;
	private String locaionCode;
	public Long getLocationId() {
		return locationId;
	}
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}
	public String getLocaionName() {
		return locaionName;
	}
	public void setLocaionName(String locaionName) {
		this.locaionName = locaionName;
	}
	public String getLocaionCode() {
		return locaionCode;
	}
	public void setLocaionCode(String locaionCode) {
		this.locaionCode = locaionCode;
	}
	@Override
	public String toString() {
		return "Locations [locationId=" + locationId + ", locaionName=" + locaionName + ", locaionCode=" + locaionCode
				+ "]";
	}
	public Locations(Long locationId, String locaionName, String locaionCode) {
		super();
		this.locationId = locationId;
		this.locaionName = locaionName;
		this.locaionCode = locaionCode;
	}
	public Locations() {
		super();
	}
	
	
}
