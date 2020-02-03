package com.hcl.ing.onlineflightbooking.exception;

public class InvalidUserException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private final String message;
	
	public InvalidUserException(String message) {
		super(message);
		this.message=message;
	}

}
