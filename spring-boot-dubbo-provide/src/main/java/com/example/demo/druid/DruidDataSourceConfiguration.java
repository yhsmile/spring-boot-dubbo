package com.example.demo.druid;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

/**
 *	@Configuration 注解该类，等价于 XML 中配置 beans；用 @Bean 标注方法等价于 XML 中配置 bean.
 *
 */
@Configuration
@EnableConfigurationProperties(DruidProperties.class)//开启属性注入,通过@autowired注入  
@ConditionalOnClass(DruidDataSource.class)//判断这个类是否在classpath中存在  
@ConditionalOnProperty(prefix="druid",value="enabled",matchIfMissing=true)//当设置druid=enabled的情况下,如果没有设置则默认为true,即条件符合  
@AutoConfigureBefore(DataSourceAutoConfiguration.class)
public class DruidDataSourceConfiguration {
	
	@Autowired
	private DruidProperties properties;
	
	@Bean
	public DataSource dataSource(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(properties.getJdbcUrl());
		dataSource.setUsername(properties.getUsername());
		dataSource.setPassword(properties.getPassword());
		if(properties.getInitialSize() > 0){
			dataSource.setInitialSize(properties.getInitialSize());
		}
		if(properties.getMaxActive() > 0){
			dataSource.setMaxActive(properties.getMaxActive());
		}
		if(properties.getMinIdle() > 0){
			dataSource.setMinIdle(properties.getMinIdle());
		}
	
		if(properties.getMaxWait() > 0){
			dataSource.setMaxWait(properties.getMaxWait());
		}
		
		dataSource.setRemoveAbandoned(properties.isRemoveAbandoned());
		if(properties.getRemoveAbandonedTimeout() > 0){
			dataSource.setRemoveAbandonedTimeout(properties.getRemoveAbandonedTimeout());
		}
		dataSource.setTestOnBorrow(properties.isTestOnBorrow());
		if(StringUtils.isNotBlank(properties.getValidationQuery())){
			dataSource.setValidationQuery(properties.getValidationQuery());
		}
		return dataSource;
	}

}
