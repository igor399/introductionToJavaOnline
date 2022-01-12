package by.epam.basic_of_software_code_development.loop;

public class Task1 {

//1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.	

	public static void main(String[] args) {
		int n = 3;
		int sum1 = 0;
		
		if (n > 0) {
			
			for (int i = 1; i <= n; i++) {
				sum1 = sum1 + i;
			}
			System.out.println(sum1);
			
		} else if (n < 0) {
			System.out.println("введите положительное число");
		}
	}
}
