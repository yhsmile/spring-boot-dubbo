package com.zhang.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhang.dao.UserDao;
import com.zhang.entity.User;

@Service(version="1.0.0")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	/**
	 * 登录这个时间
	 * @author zhang
	 */
	public String login(String username) {
		System.out.println("username:" + username);
		User user = userDao.findUser();
		return "my password is " + user.getPassword();
	}
	
}
