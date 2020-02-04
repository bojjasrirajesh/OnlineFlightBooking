package com.hcl.ing.onlineflightbooking.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hcl.ing.onlineflightbooking.dto.LoginDto;
import com.hcl.ing.onlineflightbooking.dto.LoginResponseDto;
import com.hcl.ing.onlineflightbooking.dto.RegisterResponseDto;
import com.hcl.ing.onlineflightbooking.dto.RegistrationDto;
import com.hcl.ing.onlineflightbooking.entity.Users;
import com.hcl.ing.onlineflightbooking.exception.InvalidUserException;
import com.hcl.ing.onlineflightbooking.exception.RegistrationFailedExcpetion;
import com.hcl.ing.onlineflightbooking.repository.UserRepository;
import com.hcl.ing.onlineflightbooking.util.LibraryUtil;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public LoginResponseDto usersLogin(LoginDto userDto) {
		List<Users> users = userRepository.findAll();
		LoginResponseDto responseDto = new LoginResponseDto();

		for (Users user : users) {
			if ((userDto.getuName().equalsIgnoreCase(user.getUserName()))
					&& (user.getPassword().equals(userDto.getPassword()))) {
				responseDto.setMessage(LibraryUtil.LOGIN_SUCCESS);
				responseDto.setStatusCode(HttpStatus.OK.value());
				responseDto.setUserId(user.getUserId());
				return responseDto;
			}
		}
		responseDto.setMessage(LibraryUtil.INVALID_LOGIN);
		responseDto.setStatusCode(HttpStatus.BAD_REQUEST.value());
		return responseDto;
	}

	@Override
	public RegisterResponseDto usersRegister(RegistrationDto registrationDto) {
		
		if(registrationDto.getUserName()==null||registrationDto.getPassword()==null) {
			throw new RegistrationFailedExcpetion(LibraryUtil.PROVIDE_ALL_REQUIRED_FIELDS);
		}
		Users user = new Users();

		BeanUtils.copyProperties(registrationDto, user);
		userRepository.save(user);
		RegisterResponseDto responseDto = new RegisterResponseDto();
		responseDto.setMessage(LibraryUtil.REGISTER_SUCCESS);
		responseDto.setStatusCode(HttpStatus.OK.value());
		return responseDto;
	}

}
