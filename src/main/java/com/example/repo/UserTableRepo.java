package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.User;

@Repository
public interface UserTableRepo extends CrudRepository<User, Integer>  {

}
