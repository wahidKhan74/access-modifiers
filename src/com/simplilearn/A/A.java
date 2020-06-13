package com.simplilearn.A;

public class A {
	
	//create private variable
	private String user;
	
	//create public variable
	public String bankName;
	
	//create protected varible
	protected String relation;
	
	//create default varaible
	String address;
	
	
	//bank example
	public static void main(String[] args) {	
		
		
	}
	
	public String getUser() {
		System.out.println("The Private varible :"+ this.user);
		return this.user;
	}
	protected String getRelation() {
		return this.relation;
	}
}
