package com.learning.spring.spring_first_project;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [EmpPhone=" + EmpPhone + ", EmpAddresses=" + EmpAddresses + ", EmpWorks=" + EmpWorks + "]";
	}

	public List<Integer> getEmpPhone() {
		return EmpPhone;
	}

	public void setEmpPhone(List<Integer> empPhone) {
		EmpPhone = empPhone;
	}

	public Set<String> getEmpAddresses() {
		return EmpAddresses;
	}

	public void setEmpAddresses(Set<String> empAddresses) {
		EmpAddresses = empAddresses;
	}

	public Map<Integer, String> getEmpWorks() {
		return EmpWorks;
	}

	public void setEmpWorks(Map<Integer, String> empWorks) {
		EmpWorks = empWorks;
	}

	private List<Integer> EmpPhone;
	private Set<String> EmpAddresses;
	private Map<Integer, String> EmpWorks;
}
