package by.epam.programmingWithClass.simpleobject.airline;

import java.util.Date;

public class AirlineManager {

	public Airline[] airlines;

	public AirlineManager(Airline[] airlines) {
		this.airlines = airlines;
	}

//список рейсов для заданного пункта назначения;

	public String printByDestination(String destination) {

		for (Airline airline : airlines) {

			if (airline.destination.equalsIgnoreCase(destination)) {
				System.out.println(airline.toString());
			}
		}
		return "нет такого пунтка назначения";
	}

//список рейсов для заданного дня недели;

	public DayOfWeek[] printByDayOfWeek(DayOfWeek dayOfWeek) {

		for (Airline airline : airlines) {

			for (DayOfWeek day : airline.getDayOfWeek()) {

				if (day == dayOfWeek || day == DayOfWeek.EVERYDAY) {
					System.out.println(airline.toString());

					break;
				}
			}
		}
		return null;
	}
	
//список рейсов для заданного дня недели, время вылета для которых больше заданного
	 
	public String printByDayAndTime(DayOfWeek dayOfWeek, Date departureTime) {
		
		for (Airline airline : airlines) {
			
            for (DayOfWeek day : airline.getDayOfWeek()) {
            	
                if (day == dayOfWeek || day == DayOfWeek.EVERYDAY) {
                	
                    if (airline.getDepartureTime().compareTo(departureTime) >= 0) {                 	
                    	System.out.println(airline.toString());
                    	
                        break;
                    }

                }
            }
        }
        return "нет";
	}
}
