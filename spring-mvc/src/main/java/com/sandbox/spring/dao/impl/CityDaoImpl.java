package com.sandbox.spring.dao.impl;

import com.sandbox.spring.dao.CityDao;
import com.sandbox.spring.mybatis.mapper.CityMapper;
import com.sandbox.spring.mybatis.pojo.City;
import com.sandbox.spring.mybatis.pojo.CityExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Author: zhangxin
 * Date:   15-7-1
 */
public class CityDaoImpl implements CityDao {
    @Autowired
    private CityMapper cityMapper;

    @Override
    public City get(Integer id) {
        CityExample example = new CityExample();
        CityExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<City> cityList = cityMapper.selectByExample(example);
        if(cityList.size() > 0)
            return cityList.get(0);
        return null;
    }

    @Override
    public City get(String name) {
        CityExample example = new CityExample();
        CityExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);
        List<City> cityList = cityMapper.selectByExample(example);
        if(cityList.size() > 0)
            return cityList.get(0);
        return null;
    }

    @Override
    public int insert(City city) {
        return cityMapper.insert(city);
    }
}
