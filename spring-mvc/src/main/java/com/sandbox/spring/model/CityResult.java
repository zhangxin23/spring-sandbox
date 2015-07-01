package com.sandbox.spring.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Author: zhangxin
 * Date:   15-6-30
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class CityResult {
    private String name;
    private Integer population;
    private String province;

    public CityResult() {
    }

    public CityResult(String name, Integer population, String province) {
        this.name = name;
        this.population = population;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
