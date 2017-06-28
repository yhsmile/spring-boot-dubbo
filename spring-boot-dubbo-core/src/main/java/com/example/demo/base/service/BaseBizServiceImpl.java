package com.example.demo.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import tk.mybatis.mapper.common.Mapper;

/**
 * @ClassName: BaseBizServiceImpl
 * @Description: Service基类实现类
 * @date: 2017年4月19日-下午1:53:39
 * @param <T> 泛型
 */
public abstract class BaseBizServiceImpl<T> implements BaseBizService<T> {
	
    /**
     * 通用Mapper mapper
     */
	@Autowired
	public Mapper<T> mapper;

	public Mapper<T> getMapper() {
		return mapper;
	}

    /**
     * @Title: selectByPrimaryKey
     * @Description: 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
     * @param key
     * @return
     * @see com.zito.zdss.common.core.base.service.BaseBizService#selectByPrimaryKey(java.lang.Object)
     */
	@Override
	public T selectByPrimaryKey(Object key) {
		return mapper.selectByPrimaryKey(key);
	}

    /**
     * @Title: insert
     * @Description: 保存一个实体，null属性也会保存，不会使用数据库默认值
     * @param entity
     * @return
     * @see com.zito.zdss.common.core.base.service.BaseBizService#insert(java.lang.Object)
     */
	@Override
	@Transactional
	public int insert(T entity) {
		return mapper.insert(entity);
	}

    /**
     * @Title: insertSelective
     * @Description: 保存一个实体，null的属性不会保存，会使用数据库默认值
     * @param entity
     * @return
     * @see com.zito.zdss.common.core.base.service.BaseBizService#insertSelective(java.lang.Object)
     */
	@Override
	@Transactional
	public int insertSelective(T entity) {
		return mapper.insertSelective(entity);
	}

    /**
     * @Title: updateByPrimaryKey
     * @Description: 保存一个实体，null的属性不会保存，会使用数据库默认值
     * @param entity
     * @return
     * @see com.zito.zdss.common.core.base.service.BaseBizService#updateByPrimaryKey(java.lang.Object)
     */
	@Override
	public int updateByPrimaryKey(T entity) {
		return mapper.updateByPrimaryKey(entity);
	}

    /**
     * @Title: updateByPrimaryKeySelective
     * @Description: 根据主键更新属性不为null的值
     * @param entity
     * @return
     * @see com.zito.zdss.common.core.base.service.BaseBizService#updateByPrimaryKeySelective(java.lang.Object)
     */
	@Override
	public int updateByPrimaryKeySelective(T entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

    /**
     * @Title: deleteByPrimaryKey
     * @Description: 根据主键字段进行删除，方法参数必须包含完整的主键属性
     * @param key
     * @return
     * @see com.zito.zdss.common.core.base.service.BaseBizService#deleteByPrimaryKey(java.lang.Object)
     */
	@Override
	public int deleteByPrimaryKey(Object key) {
		return mapper.deleteByPrimaryKey(key);
	}

    /**
     * @Title: selectAll
     * @Description: 查询全部结果
     * @return
     * @see com.zito.zdss.common.core.base.service.BaseBizService#selectAll()
     */
	@Override
	public List<T> selectAll() {
		return mapper.selectAll();
	}

    /**
     * @Title: selectPage
     * @Description: 分页查询全部结果
     * @param pageNum 页码
     * @param pageSize 每页显示数量
     * @return
     * @see com.zito.zdss.common.core.base.service.BaseBizService#selectPage(int,
     *      int)
     */
	@Override
	public List<T> selectPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return selectAll();
	}

    /**
     * @Title: selectPageInfo
     * @Description: 包装Page对象
     * @param pageNum
     * @param pageSize
     * @return
     * @see com.zito.zdss.common.core.base.service.BaseBizService#selectPageInfo(int,
     *      int)
     */
	@Override
	public PageInfo<T> selectPageInfo(int pageNum, int pageSize) {
		PageInfo<T> pageInfo = new PageInfo<T>(selectPage(pageNum, pageSize));
		return pageInfo;
	}
}
