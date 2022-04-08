package com.capg.day7;

public class Car 
{
int model;
String name;
String colour;

@Override
public String toString() {
	return "Car [model=" + model + ", name=" + name + ", colour=" + colour + "]";
}

public Car(int model, String name, String colour) {
	super();
	this.model = model;
	this.name = name;
	this.colour = colour;
}
public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}


}
