package com.learning.spring.jdbc.spring_DAO;

import java.util.List;

import com.learning.spring.jdbc.spring_DAO_Entity.Student;

public interface StudentDao {
	public int insert(Student student);

	public int update(Student student);

	public int delete(int studentId);

	public Student getSingleRow(int studentId);

	public List<Student> getMultipleStudent();
}
