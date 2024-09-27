package dev.esoteric_enderman.java_basics.classes.abstraction.abstract_classes;

public abstract class Animal {
	int legs;

	public Animal(int legs) {
		this.legs = legs;
	}

	public abstract void jump();
}
