package com.hcl.ing.onlineflightbooking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passangers")
public class Passangers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long passangerId;
	private String passangerName;
	private String mobileNo;
	private Long bookingId;
	public Long getPassangerId() {
		return passangerId;
	}
	public void setPassangerId(Long passangerId) {
		this.passangerId = passangerId;
	}
	public String getPassangerName() {
		return passangerName;
	}
	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	@Override
	public String toString() {
		return "Passangers [passangerId=" + passangerId + ", passangerName=" + passangerName + ", mobileNo=" + mobileNo
				+ ", bookingId=" + bookingId + "]";
	}
	public Passangers(Long passangerId, String passangerName, String mobileNo, Long bookingId) {
		super();
		this.passangerId = passangerId;
		this.passangerName = passangerName;
		this.mobileNo = mobileNo;
		this.bookingId = bookingId;
	}
	public Passangers() {
		super();
	}
	
	

}
