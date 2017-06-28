/**
 * 
 */
package com.example.demo.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**  
* Filename: BaseMapper.java  
* Description:这里使用通用Mapper，该BizMapper.java不能被扫描，否则会报错。	
* Copyright:Copyright (c)2017
* Company:  ZITO 
* @author:  yang_hui
* @version: 1.0  
* @Create:  2017年6月28日  
* Modification History:  
* Date								Author			Version
* ------------------------------------------------------------------  
* 2017年6月28日 下午2:40:03				yang_hui  	1.0
*/
public interface BizMapper<T> extends Mapper<T>,MySqlMapper<T>{

}
