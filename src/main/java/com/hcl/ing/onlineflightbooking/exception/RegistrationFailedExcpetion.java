package com.hcl.ing.onlineflightbooking.exception;

public class RegistrationFailedExcpetion extends RuntimeException {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private final String message;
	
	public RegistrationFailedExcpetion(String message) {
		super(message);
		this.message=message;
	}
}
