package by.epam.basic_of_oop.task5.sweetness;

public class SweetnessFactory {
	public Sweetness createSweetness(SweetnessType type, String name, int price) {
		switch (type) {
		case CAKE:
			return new Cake(name, price);
		case CANDY:
			return new Candy(name, price);
		case DONUT:
			return new Donut(name, price);
		case COOKIE:
			return new Cookie(name, price);
		default:
			System.out.println("Error");
			return null;
		}
	}
}
