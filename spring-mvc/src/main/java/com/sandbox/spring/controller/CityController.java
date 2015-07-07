package com.sandbox.spring.controller;

import com.sandbox.spring.model.CityResult;
import com.sandbox.spring.service.CityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Object getCity(Integer id) {
        return cityService.get(id);
    }

    @RequestMapping(value = "query", method = RequestMethod.GET)
    public Object freemarkerQuery(Model model, HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        CityResult result = (CityResult)cityService.get(id);
        model.addAttribute("city", result);
        return "city";
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public Object freemarkerIndex() {
        return "city";
    }
}
