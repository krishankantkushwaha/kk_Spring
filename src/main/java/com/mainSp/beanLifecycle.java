package com.mainSp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.blc_Employee3;

public class beanLifecycle {

	public static void main(String[] args) {

		ApplicationContext blc = new ClassPathXmlApplicationContext("beanLifecycle.xml");
		blc_Employee3 b = blc.getBean("emp",blc_Employee3.class);
		System.out.println(b);
	    
		((AbstractApplicationContext) blc).registerShutdownHook();
		
	}

}
