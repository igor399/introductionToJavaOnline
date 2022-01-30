package by.epam.programming_with_class.agregationandcomposition.car;
import static by.epam.programming_with_class.agregationandcomposition.car.EngineType.*;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(new Wheel(21,"Momo"), new Engine(4.2, HYBRID, 120), "Mercedes-Benz");
		
		System.out.println(car.toString());
	}
}
