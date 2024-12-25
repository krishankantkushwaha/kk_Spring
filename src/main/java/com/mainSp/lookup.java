package com.mainSp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee1;

public class lookup {

	public static void main(String[] args) {

		ApplicationContext look = new ClassPathXmlApplicationContext("lookup.xml");
		Employee1 lk = look.getBean(Employee1.class);
		lk.setAddress(lk.applyaddress());
		System.out.println(lk);
		lk.getAddress().setCity("GZB");
		lk.getAddress().sethNO(543);
		System.out.println(lk);
		
		
	}

}
