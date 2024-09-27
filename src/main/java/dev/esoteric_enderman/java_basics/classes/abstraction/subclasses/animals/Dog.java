package dev.esoteric_enderman.java_basics.classes.abstraction.subclasses.animals;

import dev.esoteric_enderman.java_basics.classes.abstraction.abstract_classes.Animal;

public class Dog extends Animal {
	public Dog() {
		super(4);
	}

	@Override
	public void jump() {
		System.out.println("Dog jump!");
	}
}
