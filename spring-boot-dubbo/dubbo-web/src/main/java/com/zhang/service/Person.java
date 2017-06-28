package com.zhang.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

@Controller
public class Person {

	@Reference(version = "1.0.0")
	private UserService userService;
	
	@RequestMapping("/login")
	@ResponseBody
	public String run() {
		return userService.login("abcd");
	}
}
