/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.dao.MenuMapper;
import com.example.demo.entity.Menu;

/**
 * @author Administrator
 *
 */
@Service(version="1.0.0")
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuMapper menuMapper;

	/* (non-Javadoc)
	 * @see com.example.demo.service.MenuService#findAll()
	 */
	@Override
	public List<Menu> findAll() {
		return menuMapper.findAll();
	}

	/* (non-Javadoc)
	 * @see com.example.demo.service.MenuService#selectOne()
	 */
	@Override
	public Menu selectOne() {
		return menuMapper.selectOne();
	}

	@Override
	public int save(Menu menu) {
		return menuMapper.save(menu);
	}

}
