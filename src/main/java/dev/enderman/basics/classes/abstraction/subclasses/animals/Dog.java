package dev.enderman.basics.classes.abstraction.subclasses.animals;

import dev.enderman.basics.classes.abstraction.classes.Animal;

public class Dog extends Animal {

	public Dog() {
		super(4);
	}

	@Override
	public void jump() {
		System.out.println("Dog jump!");
	}
}
