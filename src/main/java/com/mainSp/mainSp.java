package com.mainSp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class mainSp {

	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee e = (Employee)ioc.getBean("b1");
		System.out.println(e);
		

	}

}
