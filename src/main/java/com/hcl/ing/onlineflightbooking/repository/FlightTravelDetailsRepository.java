package com.hcl.ing.onlineflightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.ing.onlineflightbooking.entity.FlightTravelDetails;

@Repository
public interface FlightTravelDetailsRepository extends JpaRepository<FlightTravelDetails,Long> {
	@Query(value="SELECT seat_availability FROM flighttraveldetails  where flight_travel_details_id=?",nativeQuery=true)
	public int findByFlightTravelDetailsId(Long flightTravelDetailsId);
	
	

}
