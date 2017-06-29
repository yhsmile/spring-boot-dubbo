package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="sys_menu")
public class Menu implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5046003257357390697L;


	@Id
	private String id;
	
	
	private String menuName;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getMenuName() {
		return menuName;
	}


	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	
	
	

}
