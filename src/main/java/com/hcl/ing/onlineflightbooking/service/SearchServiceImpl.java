package com.hcl.ing.onlineflightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.ing.onlineflightbooking.dto.SearchRequestDto;
import com.hcl.ing.onlineflightbooking.dto.SearchResponseDto;
import com.hcl.ing.onlineflightbooking.entity.FlightTravelDetails;
import com.hcl.ing.onlineflightbooking.repository.SearchRepository;


@Service
public class SearchServiceImpl implements SearchService{
	
	@Autowired
	public SearchRepository searchRepository;

	
	 @Override public SearchResponseDto getsearchresult(SearchRequestDto dto) {
	  
	 List<FlightTravelDetails> findByFromLocationToLocationTravelDate =searchRepository.findByFromLocationAndToLocationAndTravelDate(dto.getFromLocation(), dto.getToLocation(), dto.getTravelDate());
	  SearchResponseDto searchdto=new SearchResponseDto();
	  searchdto.setMessage("Success");
	  searchdto.setStatusCode(HttpStatus.OK.value());
	  searchdto.setFlightTravelDetails(findByFromLocationToLocationTravelDate);
	  return searchdto; 
	  }
	 

	@Override
	public SearchResponseDto getsearchresult(@RequestParam String fromLocation,@RequestParam  String toLocation,@RequestParam String travelDate) {
		List<FlightTravelDetails> findByFromLocationToLocationTravelDate = searchRepository.findByFromLocationAndToLocationAndTravelDate(fromLocation, toLocation, travelDate);

		SearchResponseDto searchdto=new SearchResponseDto();
		searchdto.setMessage("Success");
		searchdto.setStatusCode(HttpStatus.OK.value());
		searchdto.setFlightTravelDetails(findByFromLocationToLocationTravelDate);
		return searchdto;
	}
}