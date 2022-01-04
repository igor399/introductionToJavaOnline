package by.epam.programming_with_class.simpleobject.airline;

import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException {
		Airline[] airlines = new Airline[5];

		airlines[0] = new Airline("Paris", "B2 891", "HEAVY", Airline.ft.parse("12:15"), new DayOfWeek[] {DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY });
		airlines[1] = new Airline("Berlin", "B2 990", "LIGHT", Airline.ft.parse("8:40"), new DayOfWeek[] {DayOfWeek.EVERYDAY});
		airlines[2] = new Airline("New-York", "C1 007", "MEDIUM", Airline.ft.parse("18:17"), new DayOfWeek[] {DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY});
		airlines[3] = new Airline("Boston", "C1 397", "SUPERHEAVY", Airline.ft.parse("19:31"), new DayOfWeek[] {DayOfWeek.THURSDAY});
		airlines[4] = new Airline("Moscow", "D3 519", "SUPERLIGHT", Airline.ft.parse("2:14"), new DayOfWeek[] {DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});
	
	AirlineManager airmanager = new AirlineManager(airlines);
	
	airmanager.printByDestination("New-York");
	System.out.println();	
	
	airmanager.printByDayOfWeek(DayOfWeek.MONDAY);
	System.out.println();
	
	airmanager.printByDayAndTime(DayOfWeek.FRIDAY, Airline.ft.parse("00:00"));
	}
}
