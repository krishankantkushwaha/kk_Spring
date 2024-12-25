package com.mainSp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Address;
import com.model.Employee;


public class innerbean {

	public static void main(String[] args) {
	
	ApplicationContext factory = new ClassPathXmlApplicationContext("innerbean.xml");
	Employee ob = factory.getBean(Employee.class);
	System.out.println(ob);
	ob.getAddress().setCity("Noida");
	ob.getAddress().sethNO(103);
	ob.getAddress().setState("UP");
	System.out.println(ob);
	
	
	
	
	
	
	
	
	
	
	
	                 //scope="prototype" concept//
//	Address bean = factory.getBean(Address.class);
//	Address bean1 = factory.getBean(Address.class);
//	Address bean2 = factory.getBean(Address.class);
//	Address bean3 = factory.getBean(Address.class);
//	System.out.println(bean);
//	System.out.println(bean1);
//	System.out.println(bean2);
//	System.out.println(bean3);
	}

}
