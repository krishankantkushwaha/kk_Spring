package com.model;

public class Employee {
	private String name ,gender;
	private int id ,salary;
	private Address address;


	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	public Employee(int id, String name,String gender, int salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.address = address;
	}




	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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



	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ",name=" + name + ", gender=" + gender + ", salary=" + salary + ", address="
				+ address + "]";
	}

	
}
