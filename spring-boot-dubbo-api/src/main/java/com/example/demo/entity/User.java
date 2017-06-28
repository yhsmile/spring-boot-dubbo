/**
 * 
 */
package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

/**  
* Filename: User.java  
* Description:
* Copyright:Copyright (c)2017
* Company:  ZITO 
* @author:  yang_hui
* @version: 1.0  
* @Create:  2017年6月27日  
* Modification History:  
* Date								Author			Version
* ------------------------------------------------------------------  
* 2017年6月27日 上午11:05:08				yang_hui  	1.0
*/
@Table(name="sys_user")
public class User  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7270404276214912103L;

	@Id
	private String id;
	
	private int age;
	
	private String userName;
	
	public User(){
		
	}
	
	public User(String id,String userName){
		this.id = id;
		this.userName = userName;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
