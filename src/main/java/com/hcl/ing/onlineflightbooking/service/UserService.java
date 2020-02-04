package com.hcl.ing.onlineflightbooking.service;

import com.hcl.ing.onlineflightbooking.dto.LoginDto;
import com.hcl.ing.onlineflightbooking.dto.LoginResponseDto;
import com.hcl.ing.onlineflightbooking.dto.RegisterResponseDto;
import com.hcl.ing.onlineflightbooking.dto.RegistrationDto;

public interface UserService {
	
	 LoginResponseDto usersLogin(LoginDto userDto); 
	 
	 RegisterResponseDto usersRegister(RegistrationDto registrationDto);

}
