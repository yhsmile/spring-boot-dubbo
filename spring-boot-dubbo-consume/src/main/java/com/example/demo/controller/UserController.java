package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Reference(version="1.0.0")
	private UserService userService;
	
	@RequestMapping(value = "/user")
	public User findUser(){
		return userService.findUser();
	}
	
	@RequestMapping(value = "/all")
	public List<User> findAll(){
		return userService.findAll();
	}
	
	
	@RequestMapping(value = "/save")
	public String save(){
		for(int i=1;i<=5;i++){
			User user = new User();
			user.setId(String.valueOf(i));
			user.setAge(20+1);
			user.setUserName("AA"+i);
			userService.save(user);
		}
		return "11";
	}

}
