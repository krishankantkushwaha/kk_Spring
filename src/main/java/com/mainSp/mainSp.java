package com.mainSp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Child;
import com.model.Employee;

public class mainSp {

	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee e = (Employee)ioc.getBean("b1");
		System.out.println(e);
//		Employee e2 = (Employee)ioc.getBean("b2");
//		e2.getAddress().setCity("noida");
//		e2.getAddress().sethNO(310);
//		e2.getAddress().setState("UP");
//		System.out.println(e2);

	                	// Parent-Child//

//		ApplicationContext ioc = new ClassPathXmlApplicationContext("parent_child.xml");
//	
//		Child emp = (Child) ioc.getBean("e2");
//		System.out.println(emp);
		
	}

}
