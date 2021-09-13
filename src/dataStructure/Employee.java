package dataStructure;

import com.company.Company;

public final class Employee {
	private final String name;
	private final int age;
	private final Company company;

	public Employee(String name, int age, Company company){
		this.name = name;
		this.age = age;
		this.company = company;
		company.addEmployee(this);
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public Company getCompany(){
		return new Company(company.getName());
	}
	public String toString(){
		String txt = name + " | " + age +  " | " + company.getName();
		return txt;
	}
}
