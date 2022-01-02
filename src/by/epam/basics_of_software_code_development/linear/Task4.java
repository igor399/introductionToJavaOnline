package by.epam.basics_of_software_code_development.linear;

public class Task4 {
	
//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.
	
	public static void main(String[] args) {
		double x = 123.567;
		double y = (x * 1000) % 1000 + (int) x / 1000.0;

		System.out.println(y);
		}
	}
