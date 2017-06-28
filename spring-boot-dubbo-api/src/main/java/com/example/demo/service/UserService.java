package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService{
	
	User findUser();
	
	List<User> findAll();
	
	int save(User user);

}
