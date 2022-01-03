package by.epam.basicOfSoftwareCodeDevelopment.condition;

public class Task4 {
	
// 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.	
	
	public static void main(String[] args) {
		int A = 10;
		int B = 15;
		int xk = 16;
		int yk = 14;
		int zk = 9;

		if ((xk <= A && yk <= B) || (xk <= A && zk <= B)) {
			System.out.println("Входит");
			
		} else {
			System.out.println("Не входит");
		}
	}
}
