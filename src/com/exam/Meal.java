package com.exam;

public class Meal {
	int id;
	String name;
	int price;
	int kcal;
	
	public Meal(){
		
	}
	public Meal(int id,String name,int price,int kcal){
		this.id= id;
		this.name=name;
		this.price=price;
		this.kcal=kcal;
	}
	public void setId(){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price =price;
	}
	public int getKcal(){
		return kcal;
	}
	public void setKcal(int kcal){
		this.kcal = kcal;
	}
}
