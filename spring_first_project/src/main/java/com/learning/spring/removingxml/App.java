package com.learning.spring.removingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
             Student student=context.getBean("getStudent",Student.class);
            student.RunCode();
	}

}
