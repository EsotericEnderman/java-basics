package dev.enderman.basics.classes.abstraction.subclasses.animals;

import dev.enderman.basics.classes.abstraction.classes.Animal;

public class Cat extends Animal {

	public Cat() {
		super(4);
	}

	public void meow() {
		System.out.println("'Meow' - cat");
	}

	@Override
	public void jump() {
		System.out.println("Cat jump!");
	}
}
