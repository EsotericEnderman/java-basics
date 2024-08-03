package net.slqmy.java_basics;

public class Motorbike extends Vehicle {
	public Motorbike(String colour, int wheels) {
		super(wheels, colour);
	}

	public Motorbike(String colour) {
		super(2, colour);
	}

	@Override
	public void activateBreaks() {

	}
}
