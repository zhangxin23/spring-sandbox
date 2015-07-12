package com.sandbox.spring.app;

import java.util.List;

/**
 * Author: zhangxin
 * Date:   15-7-13
 */
public class School {
    private String name;
    private int total;
    private List<Student> students;
    private List<Integer> valueList;

    public School(String name, int total, List<Student> students, List<Integer> valueList) {
        this.name = name;
        this.total = total;
        this.students = students;
        this.valueList = valueList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Integer> getValueList() {
        return valueList;
    }

    public void setValueList(List<Integer> valueList) {
        this.valueList = valueList;
    }
}
