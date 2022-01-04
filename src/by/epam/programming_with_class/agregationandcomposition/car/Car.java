package by.epam.programming_with_class.agregationandcomposition.car;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
//Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

public class Car {

	private Wheel wheel;
	private Engine engine;
	private int fuelQuantity;
	private String carModel;

	public Car(Wheel wheel, Engine engine, String carModel) {
		this.wheel = wheel;
		this.engine = engine;
		this.carModel = carModel;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getFuelQuantity() {
		return fuelQuantity;
	}

	public void setFuelQuantity(int fuelQuantity) {
		this.fuelQuantity = fuelQuantity;
	}

	public void printModel() {
		System.out.println(carModel);
	}

	public String toString() {
		return "Car [Wheel:" + wheel.getDiameter() + "," + wheel.getFirm() + "  Engine:" + engine.getEngineVolume()
				+ "," + engine.getEngineType() + "," + engine.getTankVolume() + "  Model:" + carModel + "]";
	}

	public void drive() {

		if (fuelQuantity != 0) {
			System.out.println("начнем опездку!");
			double fuelConsumption = 4;

			while (fuelQuantity > 0) {
				fuelQuantity -= fuelConsumption * engine.getEngineVolume();

				try {
					Thread.sleep(1000);
					System.out.println("продолжаем поездку!");

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("запарвка!");
			fuelQuantity = 0;
		}
	}

	public void refuel(int fuelAmount) {

		if (fuelQuantity + fuelAmount > this.engine.getEngineVolume()) {
			System.out.printf("нужно заправить %d топлива", this.engine.getEngineVolume() - fuelQuantity);
		} else
			fuelQuantity += fuelAmount;
	}
}
