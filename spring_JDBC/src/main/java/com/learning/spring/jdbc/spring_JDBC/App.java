package com.learning.spring.jdbc.spring_JDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring.jdbc.spring_DAO.StudentDao;
import com.learning.spring.jdbc.spring_DAO_Entity.Student;


public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentdao", StudentDao.class);
		Student student = new Student();

//       student.setId(2);
//       student.setName("mia Khalifa");
//       student.setCity("Brazzers");
//       int res=studentDao.update(student);
		// int res=studentDao.delete(1);
		List<Student> student2 = studentDao.getMultipleStudent();
//		for (Student s : student2) {
//			System.out.println(s);
//		}
		System.out.println(student2.get(1).getName());
	}

}