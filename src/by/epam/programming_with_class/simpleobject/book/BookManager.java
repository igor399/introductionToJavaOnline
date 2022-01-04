package by.epam.programming_with_class.simpleobject.book;

public class BookManager {

	private Book[] books;

	public BookManager(Book[] books) {
		this.books = books;
	}

//список книг заданного автора

	public String printAuthorInfo(String author) {

		for (Book book : books) {

			if (book.author.equalsIgnoreCase(author)) {
				System.out.println(book.toString());
			}
		}
		return "Нет такого автора";
	}

//список книг, выпущенных заданным издательством

	public String printPublishInfo(String publish) {

		for (Book book : books) {

			if (book.publish.equalsIgnoreCase(publish)) {
				System.out.println(book.toString());
			}
		}
		return "Нет такого издательства";
	}

//список книг, выпущенных после заданного года

	public void PrintYearBook(int minYear) {

		for (Book book : books) {

			if (book.year > minYear) {
				System.out.println(book.toString());
			}
		}
	}
}
