package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student1 = (Student)context.getBean("idStudent");
        Student student2 = context.getBean(Student.class);

        student1.setName("Antony");
        student1.setAge(22);

        System.out.println(student2.getName());
        System.out.println(student2.getAge());
    }
}
