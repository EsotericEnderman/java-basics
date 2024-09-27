package dev.esoteric_enderman.java_basics.classes.abstraction.abstract_classes;

public abstract class Vehicle {

	public String test = "This can be accessed in all sub-classes.";

	private int wheelCount;
	private String colour;

	public int getWheelCount() {
		return wheelCount;
	}

	public String getColour() {
		return colour;
	}

	public Vehicle(int wheels, String colour) {
		this.wheelCount = wheels;
		this.colour = colour;
	}

	public void method() {

	}

	public int calculate() {
		return wheelCount * 2;
	}

	public abstract void activateBreaks();
}
