package by.epam.programming_with_classes.agregationandcomposition.voucher;

import static by.epam.programming_with_classes.agregationandcomposition.voucher.TourPackageType.*;
import static by.epam.programming_with_classes.agregationandcomposition.voucher.Transport.*;
import static by.epam.programming_with_classes.agregationandcomposition.voucher.TypeOfFood.*;

//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

public class Main {

	public static void main(String[] args) {

		Tour[] tours = new Tour[10];

		tours[0] = new Tour("Italy", "Rome", new TourPackageType[] { SHOPPING }, new Transport[] { CAR },new TypeOfFood[] { NOT_INCLUDET }, 5);

		tours[1] = new Tour("Spain", "Salou", new TourPackageType[] { RECREATION }, new Transport[] {PLANE },new TypeOfFood[] { ALL_INCLUSIVE }, 14);

		tours[2] = new Tour("Spain", "Madrid", new TourPackageType[] {EXCURSION },new Transport[] { Transport.BUS }, new TypeOfFood[] {NOT_INCLUDET}, 5);

		tours[3] = new Tour("Spain", "Malaga", new TourPackageType[] {RECREATION },new Transport[] {PLANE }, new TypeOfFood[] {BREAKFAST}, 15);

		tours[4] = new Tour("Spain", "Barcelona", new TourPackageType[] {TREATMENT },new Transport[] {BUS}, new TypeOfFood[] { ALL_INCLUSIVE }, 8);

		tours[5] = new Tour("Italy", "Rome", new TourPackageType[] {EXCURSION },new Transport[] {PLANE }, new TypeOfFood[] {ALL_INCLUSIVE }, 10);

		tours[6] = new Tour("Italy", "Venice", new TourPackageType[] {CRUISE },new Transport[] {SHIP }, new TypeOfFood[] {BREAKFAST }, 20);

		tours[7] = new Tour("Italy", "Milan", new TourPackageType[] {SHOPPING },new Transport[] {PLANE }, new TypeOfFood[] {BREAKFAST }, 3);

		tours[8] = new Tour("Italy", "Florence", new TourPackageType[] {TREATMENT},new Transport[] {TRAIN }, new TypeOfFood[] {ALL_INCLUSIVE }, 13);

		tours[9] = new Tour("Italy", "Rome", new TourPackageType[] {SHOPPING },new Transport[] {CAR }, new TypeOfFood[] {NOT_INCLUDET }, 5);

		TourManager tourmanager = new TourManager(tours);

		tourmanager.printByCountry("Spain");
		System.out.println();

		tourmanager.printByCountryCity("Italy", "Rome");
		System.out.println();

		tourmanager.printByCountryTranport("Spain", BUS);
		System.out.println();

		tourmanager.printByType(TREATMENT);
		System.out.println();

		tourmanager.printByFoodDays(13,ALL_INCLUSIVE);

	}
}
