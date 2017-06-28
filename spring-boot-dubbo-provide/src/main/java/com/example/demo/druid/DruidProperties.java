package com.example.demo.druid;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 
* Filename: DruidProperties.java  
* Description: alibaba druid 数据源 配置文件
* Copyright:Copyright (c)2017
* Company:  ZITO 
* @author:  yang_hui
* @version: 1.0  
* @Create:  2017年4月19日  
* Modification History:  
* Date								Author			Version
* ------------------------------------------------------------------  
* 2017年4月19日 下午2:34:51				yang_hui  	1.0
 */
@ConfigurationProperties(prefix = "druid")
public class DruidProperties {

	/**
	 * 数据库连接地址
	 */
	private String jdbcUrl;
	/**
	 * 数据库连接用户名
	 */
	private String username;
	/**
	 * 数据库连接密码
	 */
	private String password;
	
	/**
	 * 初始化连接数量
	 */
	private int initialSize;
	
	/**
	 * 连接池最大使用连接数（默认 8）
	 */
	private int maxActive;
	/**
	 * 连接池最小空闲数（默认0）
	 */
	private int minIdle;
	/**
	 * 连接池最大空闲数（默认8）
	 */
	private int maxIdle;
	/**
	 * 获取连接最大等待时间（默认 -1 没有限制）
	 */
	private int maxWait;
	/**
	 * 表示连接数将要到达最大连接数的时候，回收无效连接。
	 */
	private boolean removeAbandoned;
	/**
	 * 回收那些一段时间没有用过的连接 （默认 300秒）
	 */
	private int removeAbandonedTimeout;
	/**
	 * 获取连接时检查连接的可用性，需要 validationQuery 的支持
	 */
	private boolean testOnBorrow;
	/**
	 * 检查连接可用性时执行的SQL语句（默认为 null），可用设置为SELECT 1
	 */
	private String validationQuery;
	
	

	public String getJdbcUrl() {
		return jdbcUrl;
	}
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getInitialSize() {
		return initialSize;
	}
	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}
	public int getMaxActive() {
		return maxActive;
	}
	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}
	public int getMinIdle() {
		return minIdle;
	}
	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}
	public int getMaxIdle() {
		return maxIdle;
	}
	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}
	public int getMaxWait() {
		return maxWait;
	}
	public void setMaxWait(int maxWait) {
		this.maxWait = maxWait;
	}
	public boolean isRemoveAbandoned() {
		return removeAbandoned;
	}
	public void setRemoveAbandoned(boolean removeAbandoned) {
		this.removeAbandoned = removeAbandoned;
	}
	public int getRemoveAbandonedTimeout() {
		return removeAbandonedTimeout;
	}
	public void setRemoveAbandonedTimeout(int removeAbandonedTimeout) {
		this.removeAbandonedTimeout = removeAbandonedTimeout;
	}
	public boolean isTestOnBorrow() {
		return testOnBorrow;
	}
	public void setTestOnBorrow(boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}
	public String getValidationQuery() {
		return validationQuery;
	}
	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}
	
	
	
	
}
