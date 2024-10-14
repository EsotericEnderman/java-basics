package dev.enderman.basics.classes.abstraction.subclasses.vehicles;

import dev.enderman.basics.classes.abstraction.classes.Vehicle;

public class Motorbike extends Vehicle {

	public Motorbike(String colour, int wheelCount) {
		super(wheelCount, colour);
	}

	public Motorbike(String colour) {
		super(2, colour);
	}

	@Override
	public void activateBreaks() {

	}
}
