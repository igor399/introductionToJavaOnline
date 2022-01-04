package by.epam.programming_with_class.agregationandcomposition.country;

import java.util.ArrayList;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

public class Country {
	private String countryName;
	private City capital;
	private ArrayList<Region> regions;

	Country(String countryName, City capital) {
		this.countryName = countryName;
		this.capital = capital;
		this.regions = new ArrayList<>();
	}

	void printNumberOfRegions() {
		System.out.printf("В %s %d регионов.\n", countryName, this.regions.size());
	}

	void printCapital() {
		System.out.printf("Столица %s: %s.\n", countryName, capital);
	}

	void printArea() {
		double area = 0;
		for (Region region : regions) {
			area += region.getArea();
		}
		System.out.printf("Площадь %s составляет %.3f кв. километров.\n", countryName, area);
	}

	void printRegioCenters() {
		System.out.printf("Региональные центры %s: ", countryName);
		for (Region region : regions) {
			System.out.print(region.getRegionalName() + ", ");
		}
		System.out.println("\b\b.");
	}

	void addRegion(Region region) {
		regions.add(region);
	}

	void removeRegion(String regionName) {
		for (Region region : regions) {
			if (regionName.equals(region.getRegionalName())) {
				regions.remove(region);
			}
		}
	}

	public ArrayList<Region> getRegions() {
		return regions;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}
}
