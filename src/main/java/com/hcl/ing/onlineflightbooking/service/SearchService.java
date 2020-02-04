package com.hcl.ing.onlineflightbooking.service;

import com.hcl.ing.onlineflightbooking.dto.SearchRequestDto;
import com.hcl.ing.onlineflightbooking.dto.SearchResponseDto;

public interface SearchService{

	public SearchResponseDto getsearchresult(SearchRequestDto dto);

	public SearchResponseDto getsearchresult(String fromLocation, String toLocation, String travelDate);
}
