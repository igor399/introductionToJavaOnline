package by.epam.programming_with_class.agregationandcomposition.car;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(new Wheel(21,"Momo"), new Engine(4.2, EngineType.HYBRID, 120), "Mercedes-Benz");
		
		System.out.println(car.toString());
	}
}
