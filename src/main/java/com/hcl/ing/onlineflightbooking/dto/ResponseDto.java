package com.hcl.ing.onlineflightbooking.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto {
	private String message;
	private Integer statusCode;
}