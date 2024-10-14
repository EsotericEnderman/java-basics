package dev.enderman.basics.classes.abstraction.classes;

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
