package com.sandbox.spring.dao;

import com.sandbox.spring.mybatis.pojo.City;

/**
 * Author: zhangxin
 * Date:   15-7-1
 */
public interface CityDao {
    City get(Integer id);
}
