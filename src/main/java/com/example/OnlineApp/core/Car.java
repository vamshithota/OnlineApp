package com.example.OnlineApp.core;

public class Car {
	private String color;
    private String type;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Car(String color, String type) {
		super();
		this.color = color;
		this.type = type;
	}
    
    
    
}
