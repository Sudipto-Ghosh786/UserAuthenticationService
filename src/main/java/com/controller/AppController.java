package com.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authenticate")
@RefreshScope
public class AppController {

	@PostMapping("/login")
	public String login() {
		return "Login Successful";
	}

	@PostMapping("/registeration")
	public String register() {
		return "User Added";
	}

	@PostMapping("/resetPass")
	public String reset() {
		return "Password Reset Successfully";
	}
}
