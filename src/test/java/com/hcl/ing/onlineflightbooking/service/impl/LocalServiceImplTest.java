package com.hcl.ing.onlineflightbooking.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.ing.onlineflightbooking.dto.LocationResponseDto;
import com.hcl.ing.onlineflightbooking.entity.Locations;
import com.hcl.ing.onlineflightbooking.repository.LocationRepository;
import com.hcl.ing.onlineflightbooking.service.LocationServiceImpl;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.Silent.class)
public class LocalServiceImplTest {
	
	@InjectMocks
	LocationServiceImpl locationServiceImpl;
	
	@Mock
	LocationRepository locationRepository;
	
	@Test
	public void testGetAllLocations() {
		
		List<Locations> listOfLocations=new ArrayList<>();
		Locations locations=new Locations();
		locations.setLocationId(new Long(1));
		locations.setLocaionCode("BLR");
		locations.setLocaionName("Bangalore");
		
		Mockito.when(locationRepository.findAll()).thenReturn(listOfLocations);
		
		
		 LocationResponseDto usersRegister = locationServiceImpl.getAllLocations();
		 
		 Assert.assertNotNull(usersRegister);
		 Assert.assertEquals(usersRegister.getStatusCode().intValue(),200);
		
		
	}

}
