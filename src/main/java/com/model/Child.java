package com.model;

public class Child extends Parent {
	
	private int id;
	private String name ,age;
	
	
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Child [id=" + id + ", name=" + name + ", age=" + age + ", getComp_name()=" + getComp_name()
				+ ", getAddress()=" + getAddress() + "]";
	}
	
	
	

	
}
