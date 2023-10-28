package com.example.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserTable {
	private Integer userId;
	private String userName;
	private String firstName;
	private String lastName;
	private Long phoneNo;
	private String nickName;
}
