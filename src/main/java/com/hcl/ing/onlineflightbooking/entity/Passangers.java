package com.hcl.ing.onlineflightbooking.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passangers")
public class Passangers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long passangerId;
	private String passangerName;
	private String mobileNo;

	
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

}
