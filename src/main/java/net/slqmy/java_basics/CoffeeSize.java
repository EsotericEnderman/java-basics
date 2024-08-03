package net.slqmy.java_basics;

public enum CoffeeSize {
	SMALL("Small", 2),
	MEDIUM("Medium", 4),
	LARGE("Large", 7);

	private String name;
	private int price;

	CoffeeSize(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() { return name; }

	public int getPrice() { return price; }
}
