package com.model;

public class Address {
	private String city ,state;
	private int hNO ;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String state, int hNO) {
		super();
		this.city = city;
		this.state = state;
		this.hNO = hNO;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int gethNO() {
		return hNO;
	}

	public void sethNO(int hNO) {
		this.hNO = hNO;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", hNO=" + hNO + "]";
	}
	
	
}
