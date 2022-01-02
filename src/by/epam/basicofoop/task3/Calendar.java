package by.epam.basicofoop.task3;

import java.util.ArrayList;
import java.util.Arrays;

//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
//выходных и праздничных днях.

public class Calendar {

	private ArrayList<Holiday> holidays = new ArrayList<>();

	void addHoliday(Holiday holiday) {
		holidays.add(holiday);
	}

	void removeHoliday(Holiday holiday) {
		holidays.remove(holiday);
	}

	void removeHoliday(String name) {
		holidays.removeIf(holiday -> holiday.getHolidayName().equals(name));
	}

	void removeHoliday(int day, int month) {
		holidays.removeIf(holiday -> holiday.getDay() == day && holiday.getMonth() == month);
	}

	void print() {
		System.out.println(Arrays.toString(holidays.toArray()));
	}

	public class Holiday {
		private String holidayName;
		private int day;
		private int month;

		public Holiday(String holidayName, int day, int month) {

			if (holidayName == null) {
				System.out.println("введите название праздника");

			} else if (month <= 0 || day < 0 || month > 12 || day > 31) {
				System.out.println("неверная дата");
			} else {

				this.holidayName = holidayName;
				this.day = day;
				this.month = month;
			}
		}

		public String getHolidayName() {
			return holidayName;
		}

		public void setHolidayName(String holidayName) {

			if (holidayName == null) {
				System.out.println("введите название праздника");
			}
			this.holidayName = holidayName;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {

			if (day > 31 || day < 0) {
				System.out.println("введите корректную дату");
			}
			this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			if (month > 12 || month < 0) {
				System.out.println("введите корректнsq месяц");
			}
			this.month = month;
		}

		@Override
		public String toString() {
			return "Holiday [holidayName=" + holidayName + ", day=" + day + ", month=" + month + "]";
		}
	}
}
