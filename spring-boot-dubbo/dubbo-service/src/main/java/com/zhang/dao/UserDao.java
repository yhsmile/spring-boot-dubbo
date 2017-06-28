package com.zhang.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.zhang.entity.User;

@Mapper
public interface UserDao {

	@Select("select * from crapapi_user where userName = 'super'")
	User findUser();
}
