package com.sandbox.spring.main;

import com.sandbox.spring.app.School;
import com.sandbox.spring.app.Student;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * Author: zhangxin
 * Date:   15-7-13
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-app-context.xml");
        School school = (School)context.getBean("school");
        System.out.println(school.getName());
        System.out.println(school.getTotal());
        for(Student item: school.getStudents()) {
            System.out.println("    " + item.getId());
            System.out.println("    " + item.getName());
            System.out.println("    " + item.getProfessional());
            System.out.println("-----------------------------");
        }
        System.out.println("valueList: ");
        for(Integer item: school.getValueList()) {
            System.out.println(item);
        }
    }
}
