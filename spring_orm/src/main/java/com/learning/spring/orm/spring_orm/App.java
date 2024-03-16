package com.learning.spring.orm.spring_orm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring.orm.spring_orm.dao.Studentdao;
import com.learning.spring.orm.spring_orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // Load Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve StudentDao bean
        Studentdao studentDao = (Studentdao) context.getBean("studentDao");

        // Create a new Student object
        Student student = new Student();
        student.setId(1);
        student.setName("John");
        student.setCity("New York");

        // Insert the Student object into the database
        int result = studentDao.insert(student);

        // Print the result
        if (result > 0) {
            System.out.println("Student inserted successfully!");
        } else {
            System.out.println("Failed to insert student.");
        }
    }
    }

