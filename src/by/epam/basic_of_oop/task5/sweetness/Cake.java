package by.epam.basic_of_oop.task5.sweetness;

public class Cake implements Sweetness {
	private String name;
	private int price;

	public Cake(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cake [name=" + name + ", price=" + price + "]";
	}
}
