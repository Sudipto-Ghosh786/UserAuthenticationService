package com.example.models;


import com.example.enums.UserType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class RegisterationRequest {
	private int userId;
	private String username;
	private String firstName;
	private String lastName;
	private Long phoneNo;
	private UserType userType;
	private String gender;
	private String nickName;
	private String companyName;
	private String gstinNo;
	private String password;
}
