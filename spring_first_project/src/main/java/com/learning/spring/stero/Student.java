package com.learning.spring.stero;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	@Value("12")
	private int year;
	@Value("#{phones}")
	private List<Integer> phones;
	@Value("#{new java.lang.String('aaditya jha')}")
private String z;
	public String getZ() {
		return z;
	}

	public void setZ(String z) {
		this.z = z;
	}

	public List<Integer> getPhones() {
		return phones;
	}

	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [year=" + year + ", phones=" + phones + ", z=" + z + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
