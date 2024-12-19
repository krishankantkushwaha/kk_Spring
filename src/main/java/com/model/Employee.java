package com.model;

public class Employee {
	private String name ,gender;
	private String id ,salary;


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String gender, String id, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}

}
