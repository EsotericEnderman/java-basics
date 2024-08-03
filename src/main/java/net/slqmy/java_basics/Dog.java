package net.slqmy.java_basics;

public class Dog extends Animal {
	public Dog() {
		super(4);
	}

	@Override
	public void jump() {
		System.out.println("Dog jump!");
	}
}
