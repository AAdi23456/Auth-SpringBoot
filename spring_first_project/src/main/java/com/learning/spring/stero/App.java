package com.learning.spring.stero;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learning/spring/stero/config.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student.hashCode());
		Student student1 = context.getBean("student", Student.class);
		System.out.println(student1);
	}

}
