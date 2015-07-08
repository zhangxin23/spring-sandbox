package com.sandbox.spring.service;

import com.sandbox.spring.mybatis.pojo.City;

/**
 * Author: zhangxin
 * Date:   15-6-30
 */
public interface CityService {
    Object get(Integer id);
    Object get(String name);
    int insert(City city);
}
