package dev.esoteric_enderman.java_basics;

public enum Dessert {
	ICE_CREAM("Ice Cream", 4),
	BROWNIE("Brownie", 6),
	CAKE("Cake", 10);

	private String name;
	private int price;

	Dessert(String name, int price) {
		this.name =  name;
		this.price = price;
	}

	public String getName() { return name; }
	public int getPrice() { return price; }
}
