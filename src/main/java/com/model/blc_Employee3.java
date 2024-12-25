package com.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class blc_Employee3 implements InitializingBean , DisposableBean{
	private String name;
	private int age, salary;
	Address address; // Association
	
	
	private void xmlInitMethod() {
		System.out.println("blc_Employee3.xmlInitMethod()");
	}
	
	private void xmlDestroyMethod() {
		System.out.println("blc_Employee3.xmlDestroyMethod()");
	}
	@Override
	public void afterPropertiesSet() throws Exception{
		System.out.println("blc_Employee3.afterPropertiesSet()");
	}
	@Override
	public void destroy() throws Exception{
		System.out.println("blc_Employee3.destroy()");
	}
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
		return "blc_Employee3 [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}

	
}
