package dev.enderman.basics.classes.abstraction.subclasses.vehicles;

import dev.enderman.basics.classes.abstraction.classes.Vehicle;

public class Car extends Vehicle {

	public Car(int wheelCount, String colour) {
		super(wheelCount, colour);

		// test is inherited from the Vehicle class.
		System.out.println(test);

		method();
	}

	// This constructor will be called if no arguments are passed for the wheel count.
	public Car(String colour) {
		super(4, colour);

		final int calculation = calculate();
		System.out.println(calculation);
	}

	public void handbrake() {

	}

	@Override
	public void activateBreaks() {
		handbrake();
	}
}
