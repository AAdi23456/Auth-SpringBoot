package com.springSecurity.entity;



public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	private int rollNo;
	private String name;
	private String stream;
	private int classname;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getClassname() {
		return classname;
	}

	public void setClassname(int classname) {
		this.classname = classname;
	}

	public Student(int rollNo, String name, String stream, int classname) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.stream = stream;
		this.classname = classname;
	}

}
