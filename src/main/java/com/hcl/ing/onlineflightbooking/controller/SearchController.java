package com.hcl.ing.onlineflightbooking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.onlineflightbooking.dto.SearchResponseDto;
import com.hcl.ing.onlineflightbooking.service.SearchService;

@RestController
@RequestMapping("/search")
@CrossOrigin(allowedHeaders = {"*","*/"}, origins = {"*","*/"})
public class SearchController {
	@Autowired
	private SearchService service;
	private static final Logger LOGGER = LoggerFactory.getLogger(SearchController.class);
	
	@GetMapping("/searchresults")
	public SearchResponseDto getSearchresult(@RequestParam String fromLocation,@RequestParam String toLocation,@RequestParam String travelDate) {
		LOGGER.info("from getSearchresult method of SearchController started");
	SearchResponseDto responsedto=service.getsearchresult(fromLocation,toLocation,travelDate);
	
    return responsedto;
		
	}

}
