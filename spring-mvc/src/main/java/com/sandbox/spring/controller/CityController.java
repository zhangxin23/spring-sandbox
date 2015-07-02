package com.sandbox.spring.controller;

import com.sandbox.spring.service.CityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Author: zhangxin
 * Date:   15-6-30
 */
@Controller
@RequestMapping(value = "city")
public class CityController {
    @Resource(name = "cityService")
    private CityService cityService;

    @RequestMapping(method= RequestMethod.GET)
    @ResponseBody
    public Object getCity(Integer id) {
        return cityService.get(id);
    }
}
