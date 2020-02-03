package com.hcl.ing.onlineflightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ing.onlineflightbooking.entity.Passangers;

@Repository
public interface PassangerRepository extends JpaRepository<Passangers,Long>  {

}
