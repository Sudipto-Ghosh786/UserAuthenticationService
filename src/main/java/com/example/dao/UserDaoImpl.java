package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entities.User;
import com.example.repo.UserTableRepo;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private UserTableRepo userTableRepo;

	@Override
	public boolean addUser(final User user) {
		userTableRepo.save(user);
		return true;
	}

	@Override
	public User getUser(final Integer userId) {
		return userTableRepo.findById(userId).get();
	}

}