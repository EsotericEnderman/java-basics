package dev.esoteric_enderman.java_basics.classes.abstraction.subclasses.vehicles;

import dev.esoteric_enderman.java_basics.classes.abstraction.abstract_classes.Vehicle;

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
