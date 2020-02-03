package com.hcl.ing.onlineflightbooking.exception;

public class RoomsNotAvailableException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private final String message;
	
	public RoomsNotAvailableException(String message) {
		super(message);
		this.message=message;
	}
}
