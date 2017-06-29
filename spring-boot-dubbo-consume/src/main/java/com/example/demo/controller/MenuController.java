package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.entity.Menu;
import com.example.demo.service.MenuService;

@RestController
@RequestMapping(value="/menu")
public class MenuController {
	
	@Reference(version="1.0.0")
	private MenuService menuService;
	
	@RequestMapping(value = "/all")
	public List<Menu> findAll(){
		return menuService.findAll();
	}
	
	
	@RequestMapping(value = "/save")
	public String save(){
		for(int i=1;i<=5;i++){
			Menu menu = new Menu();
			menu.setId(String.valueOf(i));
			menu.setMenuName("AA"+i);
			menuService.save(menu);
		}
		return "menu save success";
	}

}
