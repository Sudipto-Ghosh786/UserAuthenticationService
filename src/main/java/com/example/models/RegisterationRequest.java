package com.example.models;

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
	private Integer userId;
	private String userName;
	private String firstName;
	private String lastName;
	private Long phoneNo;
	private String nickName;
}
