package dev.esoteric_enderman.java_basics.classes.abstraction.subclasses.animals;

import dev.esoteric_enderman.java_basics.classes.abstraction.abstract_classes.Animal;

public class Cat extends Animal {
	public Cat() {
		super(4);
	}

	public void Meow() {
		System.out.println("'Meow' - cat");
	}

	@Override
	public void jump() {
		System.out.println("Cat jump!");
	}
}
