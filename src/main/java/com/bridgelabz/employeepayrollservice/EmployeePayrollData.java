package com.bridgelabz.employeepayrollservice;

import java.util.*;

public class EmployeePayrollData {

	public int id;
	public String name;
	public long  salary;

	public EmployeePayrollData(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
}
