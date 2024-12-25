package com.mainSp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.factory_DB_Singleton;

public class factory {

	public static void main(String[] args) {
	
	ApplicationContext factory = new ClassPathXmlApplicationContext("factory.xml");
	factory_DB_Singleton obj = factory.getBean("dbSingleton",factory_DB_Singleton.class);
	System.out.println(obj);
	}

}
