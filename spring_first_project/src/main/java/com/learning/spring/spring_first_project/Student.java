package com.learning.spring.spring_first_project;

import javax.annotation.PostConstruct;

public class Student {
private int studentId;
private String studentName;
private String studentSddress;
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSddress=" + studentSddress
			+ "]";
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentSddress() {
	return studentSddress;
}
public void setStudentSddress(String studentSddress) {
	this.studentSddress = studentSddress;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int studentId, String studentName, String studentSddress) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentSddress = studentSddress;
}
@PostConstruct
public void init() {
	System.out.println("i am alive");
}
//public void destroy() {
//	System.out.println("going to die");
//}

}
