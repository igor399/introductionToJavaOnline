package by.epam.basics_of_software_code_development.condition;

public class Task3 {

//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

	public static void main(String[] args) {
		int x1 = 16;
		int y1 = 3;
		int x2 = 1;
		int y2 = 3;
		int x3 = 1;
		int y3 = 7;

		if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0) {
			System.out.println("Точки лежат на одной прямой");

		} else {
			System.out.println("Точки не лежат на одной прямой!");
		}
	}
}
