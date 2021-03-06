package com.hcl.ing.onlineflightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ing.onlineflightbooking.entity.Locations;

@Repository
public interface LocationRepository extends JpaRepository<Locations, Long>{

}
