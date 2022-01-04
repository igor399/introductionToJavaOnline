package by.epam.programming_with_class.agregationandcomposition.voucher;

//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

public class TourManager {

	public Tour[] tours;

	public TourManager(Tour[] tours) {
		this.tours = tours;
	}

//поиск тура по типу:

	public String printByType(TourPackageType tourPackageType) {

		for (Tour tour : tours) {

			for (TourPackageType type : tour.getType()) {

				if (type == tourPackageType) {
					System.out.println(tour.toString());

					break;
				}
			}
		}
		return "нет такого типа тура";
	}

//поиск тура по стране назначения:

	public String printByCountry(String country) {

		for (Tour tour : tours) {

			if (tour.country.equalsIgnoreCase(country)) {
				System.out.println(tour.toString());
			}
		}
		return "нет такого пунтка назначения";
	}

// поиск тура по стране и типу транспорта

	public String printByCountryTranport(String country, Transport transport) {

		for (Tour tour : tours) {

			for (Transport transports : tour.getTransport()) {

				if (tour.country.equalsIgnoreCase(country) && transports == transport) {
					System.out.println(tour.toString());
				}
			}
		}
		return "неверные параметры";
	}

	// поиск тура по стране и городу пребывания

	public String printByCountryCity(String country, String city) {

		for (Tour tour : tours) {

			if (tour.country.equalsIgnoreCase(country) && tour.city.equalsIgnoreCase(city)) {
				System.out.println(tour.toString());
			}
		}
		return "неверные параметры";
	}

	// поиск тура по типу питания и количеству дней:

	public String printByFoodDays(int numberOfDays, TypeOfFood typeOfFood) {

		for (Tour tour : tours) {

			for (TypeOfFood food : tour.getFood()) {

				if (numberOfDays == tour.getNumberOfDays() && food == typeOfFood) {

					System.out.println(tour.toString());
				}
			}

		}
		return "неверные параметры";
	}
}
