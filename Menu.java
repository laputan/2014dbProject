package com.mycompany.myapp;

public class Menu {
	private String name;
	private String cafe;
	private int price;
	private float rating;
	private String classify;
	
	public Menu(String name, String cafe, int price, float rating){
		this.name = name;
		this.cafe = cafe;
		this.price = price;
		this.rating = rating;
	}
	
	public Menu(String name, String cafe, int price, float rating, String classify){
		this.name = name;
		this.cafe = cafe;
		this.price = price;
		this.rating = rating;
		this.classify = classify;
	}
	
	public String getName(){
		return name;
	}
	
	public String getCafe(){
		return cafe;
	}
	
	public int getPrice(){
		return price;
	}
	
	public float getRating(){
		return rating;
	}
	
	public String getClassify(){
		return classify;
	}
}
