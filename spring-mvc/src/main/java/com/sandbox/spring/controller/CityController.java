package com.sandbox.spring.controller;

import com.sandbox.spring.model.City;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: zhangxin
 * Date:   15-6-30
 */
@Controller
@RequestMapping(value = "city")
public class CityController {
    @RequestMapping(method= RequestMethod.GET)
    @ResponseBody
    public Object getCity(Integer id) {
        return new City("BeiJing", 20000000, "BeiJing");
    }
}
