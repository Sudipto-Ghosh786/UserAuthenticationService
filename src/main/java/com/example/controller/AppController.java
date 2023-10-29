package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.User;
import com.example.models.LoginRequest;
import com.example.models.LoginResponse;
import com.example.models.RegisterationRequest;
import com.example.models.RegisterationResponse;
import com.example.service.UserService;

@RestController
@RequestMapping("/authenticate")
public class AppController {
	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public LoginResponse login(@RequestBody LoginRequest loginRequest) {
		System.out.println("--------");
		System.out.println(loginRequest);
		return LoginResponse.builder().userLoginResponse(true).build();
	}

	@PostMapping("/registeration")
	public RegisterationResponse register(@RequestBody RegisterationRequest registerationRequest) {
		userService.addUserToSystem(User.builder()
				.userId(registerationRequest.getUserId())
				.username(registerationRequest.getUsername())
				.firstName(registerationRequest.getFirstName())
				.lastName(registerationRequest.getLastName())
				.nickName(registerationRequest.getNickName())
				.gender(registerationRequest.getGender())
				.userType(registerationRequest.getUserType())
				.companyName(registerationRequest.getCompanyName())
				.gstinNo(registerationRequest.getGstinNo())
				.phoneNo(registerationRequest.getPhoneNo()).build());
		return RegisterationResponse.builder().userRegisterationResponse(true).build();
	}

	@PostMapping("/resetPassword")
	public String reset() {
		return "Password Reset Successfully";
	}
}
