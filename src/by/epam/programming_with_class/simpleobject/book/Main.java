package by.epam.programming_with_class.simpleobject.book;

//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

public class Main {
	
	public static void main(String[]args) {
		
		Book[] books = new Book[5];
		
		books[0] = new Book(01,"Thinking in Java", "Bruce Eckel", "Prentice Hall", 2006, 1079, 79.5, "твёрдая");
		books[1] = new Book(02,"I am an author", "S. Dorozhko", "DorPub", 2015, 100, 5, "твёрдая");
		books[2] = new Book(03,"Head First Java", "Bert Bates, Kathy Sierra", " O'Reilly Media, Inc.", 2005, 690, 30.7, "твёрдая");
		books[3] = new Book(04,"i am a programmer", "Ivanov P. Dorozhko S.", "DorPub", 2019, 234, 10, "твёрдая");
		books[4] = new Book(05,"My life", "Dorozhko S.", "DorPub", 2019, 334, 15, "твёрдая");
		
		BookManager booker = new BookManager(books);
		
		booker.printAuthorInfo("S. Dorozhko");	
		System.out.println();
		
		booker.printPublishInfo("Prentice Hall");
		System.out.println();
		
		booker.PrintYearBook(2018);
	}
}
