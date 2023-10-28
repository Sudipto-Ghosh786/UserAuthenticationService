package com.example.service;

import com.example.entities.User;

public interface UserService {
	public abstract void addUserToSystem(final User user);
	public abstract User getUserFromSystem(final Integer userId);
}
