package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String name, gender;
	private int id, salary;
	private List<Integer> list; // <!-- list duplicate value deta hai -->
	private Set<Integer> set; // <!-- set duplicate value nhi deta hai -->
	private Map<Integer, String> map; // <!-- map duplicate value se old value ko override kr deta hai-->

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String gender, int id, int salary, List<Integer> list, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.salary = salary;
		this.list = list;
		this.set = set;
		this.map = map;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Set<Integer> getSet() {
		return set;
	}

	public void setSet(Set<Integer> set) {
		this.set = set;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
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
		return "Employee [name=" + name + ", gender=" + gender + ", id=" + id + ", salary=" + salary + ", list=" + list
				+ ", set=" + set + ", map=" + map + "]";
	}

}
