package net.slqmy.java_basics;

public abstract class Vehicle {
	public String test = "This can be accessed in all sub-classes.";
	private int wheels;
	private String colour;

	public Vehicle(int wheels, String colour) {
		this.wheels = wheels;
		this.colour = colour;
	}

	public void method() {

	}

	public int getWheels() {
		return wheels;
	}

	public String getColour() {
		return colour;
	}

	public int calculate() {
		return wheels * 2;
	}

	public abstract void activateBreaks();
}
