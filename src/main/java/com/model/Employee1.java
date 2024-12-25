package com.model;

 abstract public class Employee1 {
private String name;
private int age,salary;
	Address address;  //Association 
	public abstract Address applyaddress();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}

	
	
		}
	

