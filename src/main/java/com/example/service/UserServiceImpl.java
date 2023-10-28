package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUserToSystem(User user) {
		userDao.addUser(user);
	}

	@Override
	public User getUserFromSystem(Integer userId) {
		return userDao.getUser(userId);
	}

}
