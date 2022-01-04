package by.epam.basic_of_software_code_development.linear;

public class Task6 {

// 6. Для данной области составить линейную программу, которая печатает true,
// если точка с координатами (х, у) принадлежит закрашенной области, и false — в
// противном случае.

	public static void main(String[] args) {
		int x6 = -7;
		int y6 = -9;

		if ((x6 <= 2 && x6 >= -2 && y6 >= 0 && y6 <= 4) || (x6 >= -4 && x6 <= 4 && y6 >= -3 && y6 <= 0)) {

			System.out.println(true);
			
		} else {
			System.out.println(false);
		}
	}
}
