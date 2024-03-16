package com.learning.spring.spring_first_project;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Emp Emp1=(Emp) context.getBean("emp1");
        System.out.println(Emp1);
      
}
}