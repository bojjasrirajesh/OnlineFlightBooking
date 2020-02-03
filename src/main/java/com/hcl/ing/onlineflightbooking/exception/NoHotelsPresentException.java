package com.hcl.ing.onlineflightbooking.exception;

public class NoHotelsPresentException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private final String message;
	
	public NoHotelsPresentException(String message) {
		super(message);
		this.message=message;
	}

}
