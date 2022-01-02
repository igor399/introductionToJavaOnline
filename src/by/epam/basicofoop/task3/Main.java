package by.epam.basicofoop.task3;

//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
//выходных и праздничных днях.

public class Main {

	public static void main(String[] args) {
		Calendar calendar = new Calendar();

		Calendar.Holiday womensDay = calendar.new Holiday("Womens Day", 8, 4);
		Calendar.Holiday newYear = calendar.new Holiday("New Year", 1, 11);
		Calendar.Holiday сatholicNewYear = calendar.new Holiday("Catholic New Year", 25, 12);

		calendar.addHoliday(сatholicNewYear);
		calendar.addHoliday(womensDay);
		calendar.addHoliday(newYear);

		calendar.print();

		calendar.removeHoliday("dsdsad");

		calendar.removeHoliday(25, 12);

		calendar.print();
	}
}
