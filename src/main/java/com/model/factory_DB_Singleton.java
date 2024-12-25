package com.model;

public class factory_DB_Singleton {

	
	private factory_DB_Singleton() {System.out.println("factory_DB_Singleton.DatabaseSingleton()");}
		
	private static factory_DB_Singleton obj = new factory_DB_Singleton();
		private static  factory_DB_Singleton getInstance() {
			System.out.println("factory_DB_Singleton.getInstance()");
			return obj;
		}
	}

