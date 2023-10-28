package com.example.dao;

import com.example.entities.User;

public interface UserDao {
	public abstract boolean addUser(final User user);
	public abstract User getUser(final Integer userId);
}
