package com.learning.spring.spring_first_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class A {
private int x;

public A(int x, B y) {
	
	super();
	this.x = x;
	this.y = y;
	System.out.println("its constructor");
}
@Autowired
@Qualifier("y")
private B y;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}

public B getY() {
	
	return y;
}

public void setY(B y) {
	System.out.println("its setter method");
	this.y = y;
}
@Override
public String toString() {
	return "A [x=" + x + ", y=" + y + "]";
}
public A() {
	super();
	// TODO Auto-generated constructor stub
}
}