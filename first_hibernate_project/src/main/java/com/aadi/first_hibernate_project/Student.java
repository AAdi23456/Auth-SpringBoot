package com.aadi.first_hibernate_project;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
private int id;
private String name;
private int marks;

public Student() {
	super();
}
public Student(int id,String name,int marks) {
	this.id=id;
	this.name=name;
	this.marks=marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks=marks;
}
@Override
public String toString(){
	return "Student [name="+name + ", marks=" + marks + "]";
}
}
