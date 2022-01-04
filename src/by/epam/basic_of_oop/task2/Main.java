package by.epam.basic_of_oop.task2;

//Создать класс Payment с внутренним классом, с помощью объектов 
//которого можно сформировать покупку из нескольких товаров.

public class Main {
	public static void main(String[]args) {
		Payment payment = new Payment();
		
		Payment.Product product = payment.new Product("Mushrooms", 4, 0.4);
		
		payment.purchase(product, 5);
		
		Payment.Product productNext = payment.new Product("Eggs", 5, 0.6);
		
		payment.purchase(productNext, 3);
		
		System.out.println(payment.getTotalPrice());
	}
}
