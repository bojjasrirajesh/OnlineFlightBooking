package com.hcl.ing.onlineflightbooking.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.BeanUtils;

import com.hcl.ing.onlineflightbooking.dto.LoginDto;
import com.hcl.ing.onlineflightbooking.dto.LoginResponseDto;
import com.hcl.ing.onlineflightbooking.dto.RegisterResponseDto;
import com.hcl.ing.onlineflightbooking.dto.RegistrationDto;
import com.hcl.ing.onlineflightbooking.entity.Users;
import com.hcl.ing.onlineflightbooking.exception.InvalidUserException;
import com.hcl.ing.onlineflightbooking.exception.RegistrationFailedExcpetion;
import com.hcl.ing.onlineflightbooking.repository.UserRepository;
import com.hcl.ing.onlineflightbooking.service.UserServiceImpl;

import junit.framework.Assert;


@RunWith(MockitoJUnitRunner.Silent.class)
public class UserServiceImplTest {
	
	@InjectMocks
	UserServiceImpl userServiceImpl;
	
	@Mock
	UserRepository userRepository;
	
	@Test
	public void testUsersLoginPossitive() {
		
		List<Users> listUsers=new ArrayList<>();
		Users user=new Users();
		user.setUserId(new Long(1));user.setMobNum("289734");user.seteMail("a@b.com");user.setUserName("rajesh");user.setPassword("8283jks");
		listUsers.add(user);
		
		LoginDto loginDto=new LoginDto();
		loginDto.setuName(user.getUserName());
		loginDto.setPassword(user.getPassword());
		
		Mockito.when(userRepository.findAll()).thenReturn(listUsers);
		
		LoginResponseDto usersLogin = userServiceImpl.usersLogin(loginDto);
		
		
		Assert.assertNotNull(usersLogin);
		Assert.assertEquals(usersLogin.getStatusCode(),new Integer(200));
	}
	
	@Test(expected = InvalidUserException.class)
	public void testLoginException() {
		
		List<Users> listUsers=new ArrayList<>();
		
		Users user=new Users();
		user.setUserId(new Long(1));user.setUserName("rajesh");user.seteMail("r@g.com");user.setMobNum("893629");user.setPassword("23sdgs");
		listUsers.add(user);
		
		LoginDto loginDto=new LoginDto();
		loginDto.setuName("vinod");
		Mockito.when(userRepository.findAll()).thenReturn(listUsers);
		
		LoginResponseDto usersLogin = userServiceImpl.usersLogin(loginDto);
		
	}
	
	@Test
	public void testRegisterPossitive() {
		
		RegistrationDto registrationDto=new RegistrationDto();
		registrationDto.setUserName("rajesh");
		registrationDto.setPassword("jkwdfk");
		registrationDto.seteMail("rajesh@gmail.com");
		registrationDto.setMobNum("8937529378");
		
		Users user=new Users();
		BeanUtils.copyProperties(registrationDto, user);
		Mockito.when(userRepository.save(user)).thenReturn(user);
		
		RegisterResponseDto usersRegister = userServiceImpl.usersRegister(registrationDto);
		
		Assert.assertNotNull(usersRegister);
		Assert.assertEquals(usersRegister.getMessage(), "Register Successfull");
		
	}
	
	@Test(expected=RegistrationFailedExcpetion.class)
	public void testRegisterException() {
		
		RegistrationDto registrationDto=new RegistrationDto();
		registrationDto.setUserName(null);
		Users user=new Users();
		BeanUtils.copyProperties(registrationDto, user);
		Mockito.when(userRepository.save(user)).thenReturn(user);
		
		 RegisterResponseDto usersRegister = userServiceImpl.usersRegister(registrationDto);
		
		
	}

}
