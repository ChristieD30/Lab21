package com.CoffeShop.CoffeeShop;

public class Items {
 private String brand;
 private String description;
 private double price;
 private int id;
 private String imagePath;
 
 
 
 
 
public Items(String brand, String description, double price, int id, String imagePath) {
	super();
	this.brand = brand;
	this.description = description;
	this.price = price;
	this.id = id;
	this.imagePath = imagePath;
}
public String getImagePath() {
	return imagePath;
}
public void setImagePath(String imagePath) {
	this.imagePath = imagePath;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Items(String brand, String description, double price, int id) {
	super();
	this.brand = brand;
	this.description = description;
	this.price = price;
	this.id = id;
}
public Items(String brand, String description, double price) {
	super();
	this.brand = brand;
	this.description = description;
	this.price = price;
}
public Items() {
	super();
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}







}