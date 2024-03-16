package com.learning.spring.orm.spring_orm.entity;

import javax.persistence.Column;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_orm")
public class Student {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Id
	@Column(name = "Student_ID")
	private int id;
	@Column(name = "Student_name")
	private String name;
	@Column(name = "Student_city")
	private String city;

	public Student() {
		// TODO Auto-generated constructor stub
	}

}
