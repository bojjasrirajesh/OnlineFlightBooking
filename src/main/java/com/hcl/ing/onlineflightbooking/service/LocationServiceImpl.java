package com.hcl.ing.onlineflightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hcl.ing.onlineflightbooking.dto.LocationResponseDto;
import com.hcl.ing.onlineflightbooking.entity.Locations;
import com.hcl.ing.onlineflightbooking.repository.LocationRepository;


@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository locationRepository;

	@Override
	public LocationResponseDto getAllLocations() {
		List<Locations> listOfLocations = locationRepository.findAll();
		
		LocationResponseDto responseDto=new LocationResponseDto();
		responseDto.setMessage("Success");
		responseDto.setStatusCode(HttpStatus.OK.value());
		responseDto.setLocations(listOfLocations);
		
		return responseDto;
	}


}
