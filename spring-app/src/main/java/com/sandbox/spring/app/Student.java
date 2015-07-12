package com.sandbox.spring.app;

/**
 * Author: zhangxin
 * Date:   15-7-13
 */
public class Student {
    private int id;
    private String name;
    private String professional;

    public Student(int id, String name, String professional) {
        this.id = id;
        this.name = name;
        this.professional = professional;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }
}
