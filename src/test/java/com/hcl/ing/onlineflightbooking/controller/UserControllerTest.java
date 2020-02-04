package com.hcl.ing.onlineflightbooking.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;

import com.hcl.ing.onlineflightbooking.dto.LoginDto;
import com.hcl.ing.onlineflightbooking.dto.LoginResponseDto;
import com.hcl.ing.onlineflightbooking.dto.RegisterResponseDto;
import com.hcl.ing.onlineflightbooking.dto.RegistrationDto;
import com.hcl.ing.onlineflightbooking.entity.Users;
import com.hcl.ing.onlineflightbooking.service.UserService;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.Silent.class)
public class UserControllerTest {
	
	@InjectMocks
	UserController userController;
	
	@Mock
	UserService userService;
	
	@Test
	public void testusersLoginPossitive() {
		
		List<Users> listUsers=new ArrayList<>();
		Users user=new Users();
		user.setUserId(new Long(1));user.setMobNum("289734");user.seteMail("a@b.com");user.setUserName("rajesh");user.setPassword("8283jks");
		listUsers.add(user);
		
		LoginDto loginDto=new LoginDto();
		loginDto.setuName(user.getUserName());
		loginDto.setPassword(user.getPassword());
		
		LoginResponseDto loginResponseDto=new LoginResponseDto();
		loginResponseDto.setMessage("Login Success");
		loginResponseDto.setStatusCode(200);
		loginResponseDto.setUserId(new Long(1));
		
		Mockito.when(userService.usersLogin(loginDto)).thenReturn(loginResponseDto);
		
		LoginResponseDto usersLogin = userController.usersLogin(loginDto);
		
		
		Assert.assertNotNull(usersLogin);
		Assert.assertEquals(usersLogin.getStatusCode(),new Integer(200));
	}
	
	
	@Test
	public void testUsersRegisterPossitive() {
		
		RegistrationDto registrationDto=new RegistrationDto();
		registrationDto.setUserName("rajesh");
		registrationDto.setPassword("jkwdfk");
		registrationDto.seteMail("rajesh@gmail.com");
		registrationDto.setMobNum("8937529378");
		
		Users user=new Users();
		BeanUtils.copyProperties(registrationDto, user);
		RegisterResponseDto registerResponseDto=new RegisterResponseDto();
		registerResponseDto.setMessage("Registration successfull");
		registerResponseDto.setStatusCode(HttpStatus.CREATED.value());
		Mockito.when(userService.usersRegister(registrationDto)).thenReturn(registerResponseDto);
		
		RegisterResponseDto usersRegister = userController.usersRegister(registrationDto);
		
		Assert.assertNotNull(usersRegister);
		Assert.assertEquals(usersRegister.getStatusCode().intValue(), 201);
		
	}
	
	

}
