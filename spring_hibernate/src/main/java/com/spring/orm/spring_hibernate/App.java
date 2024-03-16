package com.spring.orm.spring_hibernate;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.spring_hibernate.dao.Studentdao;
import com.spring.orm.spring_hibernate.entity.Student;

public class App {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("Hello World!");
		Scanner scanner = new Scanner(System.in);
		// Load Spring configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Retrieve StudentDao bean
		Studentdao studentDao = (Studentdao) context.getBean("studentDao");
		int choice = 0;
		while ( choice < 6) {
			System.out.println("Enter 1 for Adding the new Student");
			System.out.println("Enter 2 for get student data");
			System.out.println("Enter 3 for get all the students data");
			System.out.println("Enter 4 for update Student data");
			System.out.println("Enter 5 for delete Student data");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter student name");
				String name = scanner.nextLine();
				System.out.println("Enter student city");
				String city = scanner.nextLine();
				student.setCity(city);
				student.setName(name);
				studentDao.insert(student);
				break;
			case 2:
				System.out.println("Enter the student id");
				int id = scanner.nextInt();
				System.out.println(studentDao.getOne(id));
				break;
			case 3:
				System.out.println(studentDao.getAll());
				break;
			case 5:
				System.out.println("Enter id");
				int id1 = scanner.nextInt();
				studentDao.delete(id1);
				break;
			default:
				break;
			}
		}

	}
}
