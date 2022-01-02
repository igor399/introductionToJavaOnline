package by.epam.programming_with_classes.simpleobject;

//	6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его отдельных полей
//	(час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается 
//	в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.

public class Time {

	private int hour;
	private int minute;
	private int second;

	private void setHour(int hour) {

		if (hour > 23 || hour < 0) {
			this.hour = 0;

		} else {
			this.hour = hour;
		}
	}

	private void setMinute(int minute) {

		if (minute > 60 || minute < 0) {
			this.minute = 0;

		} else {
			this.minute = minute;
		}
	}

	private void setSecond(int second) {

		if (second > 60 || second < 0) {
			this.second = 0;

		} else {
			this.second = second;
		}
	}

	private void varHour(int hour) {
		this.hour = (this.hour + hour) % 24;

		if (this.hour < 0) {
			this.hour += 24;
		}
	}

	private void varMinute(int minute) {

		if ((this.minute + minute) < 0) {
			varHour(minute / 60 - 1);
			this.minute = 60 + ((this.minute + minute) % 60);

		} else {
			varHour((this.minute + minute) / 60);
			this.minute = (this.minute + minute) % 60;
		}
	}

	private void varSecond(int second) {

		if ((this.second + second) < 0) {
			varMinute(second / 60 - 1);
			this.second = 60 + ((this.second + second) % 60);

		} else {
			varMinute((this.second + second) / 60);
			this.second = (this.second + second) % 60;
		}
	}

	private String getTime() {
		return String.format("%d:%d:%d", hour, minute, second);
	}
	
	private Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public static void main(String[] args) {

		Time time = new Time(22, 52, 75);
		System.out.println("Initial time: " + time.getTime());

		System.out.print("time.setSecond(12): ");
		time.setSecond(12);
		System.out.println(time.getTime());

		System.out.print("time.varHour(11): ");
		time.varHour(11);
		System.out.println(time.getTime());

		System.out.print("time.varMinute(5): ");
		time.varMinute(5);
		System.out.println(time.getTime());

		System.out.print("time.varSecond(-10): ");
		time.varSecond(-10);
		System.out.println(time.getTime());
	}
}
