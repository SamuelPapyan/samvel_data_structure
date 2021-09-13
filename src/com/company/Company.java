package com.company;

import dataStructure.Employee;

import java.util.ArrayList;
import java.util.List;

public final class Company {
	private final String name;
	private final List<Employee> employees;
	public Company(String name){
		employees = new ArrayList<>();
		this.name = name;
	}
	public void addEmployee(Employee employee){
		employees.add(employee);
	}
	public String getName(){
		return name;
	}
	public String toString(){
		String txt = "Company: " + name  + " | ";
		txt += "Employees: " + employees.size();
		return txt;
	}
	public List<Employee> getEmployees(){
		List<Employee> tempEmployees = new ArrayList<>();
		for(Employee emp : employees){
			tempEmployees.add(new Employee(emp.getName(), emp.getAge(), emp.getCompany()));
		}
		return tempEmployees;
	}
}