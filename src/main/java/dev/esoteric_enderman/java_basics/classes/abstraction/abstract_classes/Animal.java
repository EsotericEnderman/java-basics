package dev.esoteric_enderman.java_basics.classes.abstraction.abstract_classes;

public abstract class Animal {

	private int legCount;

	public int getLegCount() {
		return legCount;
	}

	public Animal(int legCount) {
		this.legCount = legCount;
	}

	public abstract void jump();
}
