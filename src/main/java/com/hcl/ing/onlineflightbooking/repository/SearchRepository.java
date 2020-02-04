package com.hcl.ing.onlineflightbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ing.onlineflightbooking.entity.FlightTravelDetails;



@Repository
public interface SearchRepository extends JpaRepository<FlightTravelDetails,Long> {
	 
	 
	 public List<FlightTravelDetails> findByFromLocationAndToLocationAndTravelDate(String fromLocation,String toLocation,String travelDate);
	 
	
	 
	 
}
