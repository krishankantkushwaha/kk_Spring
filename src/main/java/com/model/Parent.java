package com.model;

public class Parent {
private String Comp_name ,Address;


public String getComp_name() {
	return Comp_name;
}

public void setComp_name(String comp_name) {
	System.out.println("Parent.setComp_name()");
	Comp_name = comp_name;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	System.out.println("Parent.setAddress()");
	Address = address;
}


	
}
