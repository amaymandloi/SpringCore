package com.yash.factorymethod_1;

public class DBRole implements Role{

	public DBRole() {
		System.out.println("DBRole class Object create");	
	}
	
	public void role() {
		System.out.println("Interaction with DataBase ");
		
	}

}
