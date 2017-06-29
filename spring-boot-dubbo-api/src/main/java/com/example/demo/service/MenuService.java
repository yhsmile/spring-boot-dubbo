/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Menu;

/**
 * @author Administrator
 *
 */
public interface MenuService {
	
	List<Menu> findAll();
	
	Menu selectOne();
	
	int save(Menu menu);

}
