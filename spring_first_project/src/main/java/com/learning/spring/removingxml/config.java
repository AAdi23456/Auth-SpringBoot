package com.learning.spring.removingxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.learning.spring.removingxml")
public class config {
	@Bean
	public Student getStudent() {
		Student student = new Student();
		return student;
	}
}
