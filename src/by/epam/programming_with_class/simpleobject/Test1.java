package by.epam.programming_with_class.simpleobject;

//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
//Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение 
//из этих двух переменных.

public class Test1 {
	public int a = 10;
	public int b = 12;

	public void printValue() {
		System.out.println(a);
		System.out.println(b);
	}

	public void changeValue1(int value1) {
		a = value1;
	}

	public void changeValue2(int value2) {
		b = value2;
	}

	public int sumOfValue() {
		return a + b;
	}

	public int findMaxValue() {
		return Math.max(a, b);
	}
}
