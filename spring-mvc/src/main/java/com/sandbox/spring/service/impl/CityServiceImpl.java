package com.sandbox.spring.service.impl;

import com.sandbox.spring.dao.CityDao;
import com.sandbox.spring.model.CityResult;
import com.sandbox.spring.mybatis.pojo.City;
import com.sandbox.spring.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: zhangxin
 * Date:   15-6-30
 */
@Service(value = "cityService")
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;

    @Override
    public Object get(Integer id) {
        City city = cityDao.get(id);
        if(city == null)
            throw new IllegalArgumentException("There is no this city.");

        return new CityResult(city.getName(), city.getPopulation(), city.getProvince());
    }
}
