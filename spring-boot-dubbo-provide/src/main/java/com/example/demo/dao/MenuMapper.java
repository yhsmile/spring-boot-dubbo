package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Menu;
import com.example.demo.mapper.BizMapper;

public interface MenuMapper extends BizMapper<Menu>{
	
	List<Menu> findAll();
	
	Menu selectOne();

	int save(Menu menu);
}
