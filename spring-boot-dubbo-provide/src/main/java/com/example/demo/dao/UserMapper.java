package com.example.demo.dao;


import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.mapper.BizMapper;

public interface UserMapper extends BizMapper<User> {
	
	List<User> findAll();
	
}