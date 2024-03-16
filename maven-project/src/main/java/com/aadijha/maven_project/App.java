package com.aadijha.maven_project;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceException;

public class App {
static EntityManagerFactory entityManagerFactory=null;
static {
	entityManagerFactory=Persistence.createEntityManagerFactory("abc");
}
   public static void createstudent(Student student) {
	   EntityManager entityManager=null;
	   EntityTransaction transaction=null;
	   try {
		   entityManager=entityManagerFactory.createEntityManager();
		   transaction=entityManager.getTransaction();
		   transaction.begin();	
		   entityManager.persist(student);
		   transaction.commit();
		   System.out.println("Added successfully");
	   }catch(PersistenceException pe){
		   System.out.println(pe.getMessage());
		   transaction.rollback();
	   }finally {
		   entityManager.close();
	   }
   }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("name");
       String name=sc.nextLine();
       System.out.println("marks");
       int marks=sc.nextInt();
       System.out.println("id");
       int id=sc.nextInt();
       Student student=new Student(id,name,marks);
       createstudent(student);
       sc.close();
    }
}
