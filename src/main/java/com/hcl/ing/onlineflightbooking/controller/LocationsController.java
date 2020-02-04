package com.hcl.ing.onlineflightbooking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.onlineflightbooking.dto.LocationResponseDto;
import com.hcl.ing.onlineflightbooking.service.LocationService;
import com.hcl.ing.onlineflightbooking.util.LibraryUtil;
/**
 * This class for the to get list of locations
 * @author bojja.r
 * @version 1.0
 * @since 30-01-2020
 */

@RestController
@RequestMapping("/locations")
@CrossOrigin(allowedHeaders = {"*","*/"}, origins = {"*","*/"})
public class LocationsController {
	private static final Logger LOGGER = LoggerFactory.getLogger(LocationsController.class);
	
	 @Autowired 
	 LocationService locationService;
	 /**
		 * This method is used to get all locations 
		 * 
		 * @return locationResponseDto 
		 */
	 @GetMapping(value = "/getLocations") 
	 public LocationResponseDto getAllLocations() { 
		 LOGGER.info(LibraryUtil.ALL_LOCATIONS_METHOD);
		 return locationService.getAllLocations();
	 }
}
