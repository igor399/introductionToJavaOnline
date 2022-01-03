package by.epam.programmingWithClass.simpleobject;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу
//в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. Счетчик
//имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. Написать код, 
//демонстрирующий все возможности класса.

public class DecimalCounter {

	public int counter;
	public int start;
	public int maxValue;

	public static void main(String[] args) {

	}

	public DecimalCounter(int start, int maxVlue, int counter) {

		if (start > maxValue) {
			this.maxValue = start;
			this.start = maxValue;

		} else {
			this.start = start;			
		}

		if (counter > this.maxValue | counter < this.start) {
			System.out.println("неверные параметры");
		}
		this.counter = counter;
	}

	public DecimalCounter(int start, int maxValue) {

		if (start > maxValue) {
			this.maxValue = start;
			this.start = maxValue;

		} else {
			this.start = start;
			this.maxValue = maxValue;
		}

		if (counter > this.maxValue | counter < this.start) {
			System.out.println("wrong parametres");
		}
	}

	public DecimalCounter() {
		start = 0;
		maxValue = Integer.MAX_VALUE;
	}

	public void push() {

		if (counter + 1 <= maxValue & counter + 1 >= start) {
			counter++;
		}
	}

	public void push(int number) {

		if (counter == maxValue & number > 0 | counter == start & number < 0) {

		} else {

			if (counter + number > maxValue) {
				counter += maxValue - counter;

			} else if (counter + number < start) {
				counter += start - counter;

			} else {
				counter += number;
			}
		}
	}

	public void pop() {

		if (counter - 1 <= maxValue & counter - 1 > start) {
			counter--;
		}
	}

	public void pop(int number) {

		if (counter == maxValue & number < 0 | counter == start & number > 0) {

		} else {
			if (counter - number > maxValue) {
				counter -= maxValue - counter;
				
			} else if (counter - number < start) {
				counter -= start - counter;
				
			} else {
				counter -= number;
			}
		}
	}

	public int getCounter() {
		
		return counter;
	}
}
