package by.epam.basic_of_software_code_development.linear;

public class Task3 {
	
//3. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦∗𝑡𝑔 𝑥𝑦	
	
	public static void main(String[] args) {
		double rad1 = 0.5;
		double rad2 = -0.1;
		
		double rad3 = (Math.sin(rad1) + Math.cos(rad2)) / (Math.cos(rad1) - Math.sin(rad2)) * Math.tan(rad1 * rad2);

		System.out.println(rad3);
	}
}
