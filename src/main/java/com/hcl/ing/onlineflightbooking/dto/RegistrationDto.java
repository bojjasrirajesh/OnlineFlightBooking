package com.hcl.ing.onlineflightbooking.dto;

import java.io.Serializable;

public class RegistrationDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String uName;
	private String password;
	private String mobNum;
	private String eMail;

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobNum() {
		return mobNum;
	}

	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

}
