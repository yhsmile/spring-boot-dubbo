/**
 * 
 */
package com.example.demo.base.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**  
* Filename: BaseBizService.java  
* Description:
* Copyright:Copyright (c)2017
* Company:  ZITO 
* @author:  yang_hui
* @version: 1.0  
* @Create:  2017年6月28日  
* Modification History:  
* Date								Author			Version
* ------------------------------------------------------------------  
* 2017年6月28日 下午5:21:38				yang_hui  	1.0
*/
public interface BaseBizService<T> {
	
	/**
	 * 
	 * @Description: 根据主键查找对象
	 * @author yang_hui 
	 * @Created 2016年9月14日
	 * @param key
	 * @return
	 */
	T selectByPrimaryKey(Object key);
	/**
	 * 
	 * @Description: 保存新的对象(保存该对象的全部属性)
	 * @author yang_hui 
	 * @Created 2016年9月14日
	 * @param entity
	 * @return
	 */
	int insert(T entity);
	/**
	 * 
	 * @Description: 保存新的对象(null的属性不会保存，会使用数据库默认值)
	 * @author yang_hui 
	 * @Created 2016年9月14日
	 * @param entity
	 * @return
	 */
	int insertSelective(T entity);
	/**
	 * 
	 * @Description: 根据主键修改对象(更新实体全部属性)
	 * @author yang_hui 
	 * @Created 2016年9月14日
	 * @param entity
	 * @return
	 */
	int updateByPrimaryKey(T entity);
	/**
	 * 
	 * @Description:根据主键修改对象(null的属性不会更新)
	 * @author yang_hui 
	 * @Created 2016年9月14日
	 * @param entity
	 * @return
	 */
	int updateByPrimaryKeySelective(T entity);
	
	/**
	 * 
	 * @Description: 根据主键删除对象
	 * @author yang_hui 
	 * @Created 2016年9月14日
	 * @param key
	 * @return
	 */
	int deleteByPrimaryKey(Object key);
	
	
	/**
	 * 
	 * @Description: 查询所有的对象列表（不分页）
	 * @author yang_hui 
	 * @Created 2016年9月27日
	 * @return
	 */
	List<T> selectAll();

	
	/**
	 * 
	 * @Description: 分页查询，直接返回分页后的对象数组
	 * @author yang_hui 
	 * @Created 2016年9月27日
	 * @param pageNum 当前页数
	 * @param pageSize 每页数量
	 * @return 
	 */
	List<T> selectPage(int pageNum,int pageSize);

	/**
	 * 
	 * @Description: 分页查询，直接返回分页后的分页对象
	 * @author yang_hui 
	 * @Created 2016年9月27日
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	PageInfo<T> selectPageInfo(int pageNum,int pageSize);
}
