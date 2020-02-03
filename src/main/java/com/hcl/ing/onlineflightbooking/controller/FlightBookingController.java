package com.hcl.ing.onlineflightbooking.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

/*
 *  @author Shankar 
 * 
 * Method is used for manager functions that includes his login,
 * getting list of resources and viewing the resources based on their skill 
 * and getting their count
 * 
 */

@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RestController
@RequestMapping("/booking")
@Slf4j
public class FlightBookingController {

}
