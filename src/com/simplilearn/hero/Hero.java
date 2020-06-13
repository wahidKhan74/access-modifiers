package com.simplilearn.hero;

public class Hero {
	
	public String name;
	private double assets;
	protected String items;
	
	public Hero(String name,double assets, String items){
		this.name = name;
		this.assets = assets;
		this.items = items;		
	}
	
	public static void main(String[] args) {
		

	}
	
	public String getName() {
		return this.name;
	}
	
	private double getAssets() {
		this.getAssets();
		return this.assets;
	}
	
	protected String getItems() {
		return this.items;
	}
	

}
