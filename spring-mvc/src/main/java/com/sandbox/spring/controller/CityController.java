package com.sandbox.spring.controller;

import com.sandbox.spring.model.CityResult;
import com.sandbox.spring.mybatis.pojo.City;
import com.sandbox.spring.service.CityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Author: zhangxin
 * Date:   15-6-30
 */
@Controller
@RequestMapping(value = "city")
public class CityController {
    @Resource(name = "cityService")
    private CityService cityService;

    @RequestMapping(value = "message/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getCity(@PathVariable("id") Integer id) {
        return cityService.get(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Object getCity(@RequestParam(value = "name")String name) {
        return cityService.get(name);
    }

    @RequestMapping(value = "empty", method = RequestMethod.POST)
    @ResponseBody
    public Object testEmptyStringParam(@RequestParam(value = "param")Integer param) {
        if(param == null)
            return "param is null.";
        else
            return "param is not null.";
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public Object freemarkerIndex() {
        return "city";
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Object freemarkerQuery(Model model, HttpServletRequest request, @PathVariable Integer id) {
//        int id = Integer.parseInt(request.getParameter("id"));
        CityResult result = (CityResult)cityService.get(id);
        model.addAttribute("city", result);
        return "city";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Object freemarkerAdd(Model model, HttpServletRequest request) {
        String name = request.getParameter("name");
        int population = Integer.parseInt(request.getParameter("population"));
        String province = request.getParameter("province");
        City city = new City();
        city.setName(name);
        city.setPopulation(population);
        city.setProvince(province);
        cityService.insert(city);
        return "city";
    }
}
