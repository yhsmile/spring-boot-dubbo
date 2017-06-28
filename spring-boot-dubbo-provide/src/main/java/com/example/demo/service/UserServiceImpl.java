package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;

@Service(version="1.0.0")
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUser() {
		return new User("123","用户");
	}

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	@Override
	public int save(User user) {
		return userMapper.insertSelective(user);
	}

}
