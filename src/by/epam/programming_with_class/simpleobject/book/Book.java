package by.epam.programming_with_class.simpleobject.book;

public class Book {

	public int id;
	public String title;
	public String author;
	public String publish;
	public int year;
	public int numOfPage;
	public double price;
	public String bindingType;

	public Book(int id, String title, String author, String publish, int year, int numOfPage, double price,String bindingType) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publish = publish;
		this.year = year;
		this.numOfPage = numOfPage;
		this.price = price;
		this.bindingType = bindingType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumOfPage() {
		return numOfPage;
	}

	public void setNumOfPage(int numOfPage) {
		this.numOfPage = numOfPage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publish=" + publish + ", year=" + year
				+ ", numOfPage=" + numOfPage + ", price=" + price + ", bindingType=" + bindingType + "]";
	}
}
