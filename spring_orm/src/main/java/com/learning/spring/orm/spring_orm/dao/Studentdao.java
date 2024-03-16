package com.learning.spring.orm.spring_orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.learning.spring.orm.spring_orm.entity.Student;

public class Studentdao {
	
	private HibernateTemplate hibernateTemplate;

	public int insert(Student student) {
		Integer res = (Integer) this.hibernateTemplate.save(student);
		return res;
	}

}
