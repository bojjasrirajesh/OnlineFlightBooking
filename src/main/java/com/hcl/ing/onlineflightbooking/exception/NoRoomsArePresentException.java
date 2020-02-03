package com.hcl.ing.onlineflightbooking.exception;

public class NoRoomsArePresentException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private final String message;
	
	public NoRoomsArePresentException(String message) {
		super(message);
		this.message=message;
	}
}
