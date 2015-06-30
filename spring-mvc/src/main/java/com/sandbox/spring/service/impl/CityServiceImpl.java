package com.sandbox.spring.service.impl;

import com.sandbox.spring.model.City;
import com.sandbox.spring.service.CityService;
import org.springframework.stereotype.Service;

/**
 * Author: zhangxin
 * Date:   15-6-30
 */
@Service(value = "cityService")
public class CityServiceImpl implements CityService {

    @Override
    public Object get(Integer id) {
        return new City("Shanghai", 25000000, "Shanghai");
    }
}
