package by.epam.programming_with_classes.simpleobject.airline;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

//Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

public class Airline {

	public String destination;
	public String flightNumber;
	public String planeType;
	public Date departureTime;
	public DayOfWeek[] dayOfWeek;

	static SimpleDateFormat ft = new SimpleDateFormat("HH:mm");

	public Airline(String destination, String flightNumber, String planeType, Date departureTime, DayOfWeek[] dayOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.planeType = planeType;
		this.departureTime = departureTime;
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", planeType=" + planeType
				+ ", departureTime=" + departureTime + ", dayOfWeek=" + Arrays.toString(dayOfWeek) + "]";
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public DayOfWeek[] getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek[] dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
}
