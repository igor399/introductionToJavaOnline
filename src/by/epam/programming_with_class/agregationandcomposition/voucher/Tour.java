package by.epam.programming_with_class.agregationandcomposition.voucher;

import java.util.Arrays;

public class Tour {

	public String country;
	public String city;
	public TourPackageType[] type;
	public Transport[] transport;
	public TypeOfFood[] food;
	public int numberOfDays;

	public Tour(String country, String city, TourPackageType[] type, Transport[] transport, TypeOfFood[] food,int numberOfDays) {
		this.country = country;
		this.city = city;
		this.type = type;
		this.transport = transport;
		this.food = food;
		this.numberOfDays = numberOfDays;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public TourPackageType[] getType() {
		return type;
	}

	public void setType(TourPackageType[] type) {
		this.type = type;
	}

	public Transport[] getTransport() {
		return transport;
	}

	public void setTransport(Transport[] transport) {
		this.transport = transport;
	}

	public TypeOfFood[] getFood() {
		return food;
	}

	public void setFood(TypeOfFood[] food) {
		this.food = food;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	@Override
	public String toString() {
		return "Tour [country=" + country + ", city=" + city + ", type=" + Arrays.toString(type) + ", transport="
				+ Arrays.toString(transport) + ", food=" + Arrays.toString(food) + ", numberOfDays=" + numberOfDays
				+ "]";
	}


}
