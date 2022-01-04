package by.epam.programming_with_class.agregationandcomposition.car;

public class Engine {
	
	private double engineVolume;
	private EngineType engineType;
	private int tankVolume;
	
	public Engine(double engineVolume, EngineType engineType, int tankVolume) {
		this.engineVolume = engineVolume;
		this.engineType = engineType;
		this.tankVolume = tankVolume;
	}

	public double getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}

	public EngineType getEngineType() {
		return engineType;
	}

	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}

	public int getTankVolume() {
		return tankVolume;
	}

	public void setTankVolume(int tankVolume) {
		this.tankVolume = tankVolume;
	}
}
