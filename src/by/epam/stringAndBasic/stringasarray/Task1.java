package by.epam.stringAndBasic.stringasarray;

public class Task1 {

//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

	public static void main(String[] args) {

		System.out.println(createSnakeCase("camelCase"));
	}

	public static String createSnakeCase(String camelCase) {

		String snakeCase;
		char[] camelCaseSymb = camelCase.toCharArray();
		int upperCaseCount = findUpperCaseCount(camelCaseSymb);
		char[] snakeCaseSymb = new char[camelCaseSymb.length + upperCaseCount];

		for (int i = 0, j = 0; i < camelCaseSymb.length; i++, j++) {

			if (Character.isUpperCase(camelCaseSymb[i])) {
				snakeCaseSymb[j] = '_';
				snakeCaseSymb[++j] = Character.toLowerCase(camelCaseSymb[i]);

			} else {
				snakeCaseSymb[j] = camelCaseSymb[i];
			}
		}
		snakeCase = new String(snakeCaseSymb);

		return snakeCase;
	}

	private static int findUpperCaseCount(char[] symbols) {
		int upperCaseCount = 0;

		for (char symbol : symbols) {

			if (Character.isUpperCase(symbol)) {
				upperCaseCount++;
			}
		}
		return upperCaseCount;
	}
}
