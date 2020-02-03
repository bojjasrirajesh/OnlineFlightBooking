package com.hcl.ing.onlineflightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ing.onlineflightbooking.entity.FlightTravelDetails;

@Repository
public interface FlightTravelDetailsRepository extends JpaRepository<FlightTravelDetails,Long> {
	
	public Integer findByFlightTravelDetailsId(Long FlightTravelDetailsId);

}
