package com.spring.orm.spring_hibernate.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.spring_hibernate.entity.Student;

public class Studentdao {

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student student) {

		Integer res = (Integer) this.hibernateTemplate.save(student);
		return res;
	}

	public Student getOne(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}

	public List<Student> getAll() {
		List<Student> studentsList = this.hibernateTemplate.loadAll(Student.class);
		return studentsList;

	}

	public void update(Student student) {
		this.hibernateTemplate.update(student);
	}

	public void delete(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
}
