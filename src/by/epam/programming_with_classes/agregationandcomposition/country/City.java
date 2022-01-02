package by.epam.programming_with_classes.agregationandcomposition.country;

public class City {
	private String name;
	private int population;

	public City(String name, int population) {
		this.name = name;
		this.population = population;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
}
