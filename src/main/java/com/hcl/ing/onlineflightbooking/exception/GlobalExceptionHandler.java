package com.hcl.ing.onlineflightbooking.exception;

import java.time.LocalDateTime;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(InvalidUserException.class)
    public ResponseEntity<ErrorResponse> invalidUserException(InvalidUserException ex) {
        
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setMessgage(ex.getMessage());
		errorResponse.setStatusCode(HttpStatus.BAD_REQUEST.value());
		errorResponse.setDateAndTime(LocalDateTime.now());
		
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }
	@ExceptionHandler(NoHotelsPresentException.class)
    public ResponseEntity<ErrorResponse> noHotelsPresentException(NoHotelsPresentException ex) {
        
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setMessgage(ex.getMessage());
		errorResponse.setStatusCode(HttpStatus.BAD_GATEWAY.value());
		errorResponse.setDateAndTime(LocalDateTime.now());
		
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_GATEWAY);
    }
	@ExceptionHandler(NoRoomsArePresentException.class)
    public ResponseEntity<ErrorResponse> noRoomsArePresentException(NoRoomsArePresentException ex) {
        
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setMessgage(ex.getMessage());
		errorResponse.setStatusCode(HttpStatus.BAD_GATEWAY.value());
		errorResponse.setDateAndTime(LocalDateTime.now());
		
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_GATEWAY);
    }
	@ExceptionHandler(RegistrationFailedExcpetion.class)
    public ResponseEntity<ErrorResponse> registrationFailedExcpetion(RegistrationFailedExcpetion ex) {
        
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setMessgage(ex.getMessage());
		errorResponse.setStatusCode(HttpStatus.BAD_REQUEST.value());
		errorResponse.setDateAndTime(LocalDateTime.now());
		
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }
	@ExceptionHandler(RoomsNotAvailableException.class)
    public ResponseEntity<ErrorResponse> roomsNotAvailableException(RoomsNotAvailableException ex) {
        
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setMessgage(ex.getMessage());
		errorResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
		errorResponse.setDateAndTime(LocalDateTime.now());
		
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }

}
