package by.epam.programming_with_class.simpleobject.customer;

public class Customer {
	public int id;
	public String lastName;
	public String name;
	public String middleName;
	public String adress;
	public int cardNumber;
	public int bankNumber;

	public Customer(int id, String lastName, String name, String middleName, String adress, int cardNumber,int bankNumber) {
		this.id = id;
		this.lastName = lastName;
		this.name = name;
		this.middleName = middleName;
		this.adress = adress;
		this.cardNumber = cardNumber;
		this.bankNumber = bankNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getBunkNumber() {
		return bankNumber;
	}

	public void setBunkNumber(int bunkNumber) {
		this.bankNumber = bunkNumber;
	}

	public String toString() {
		return '{' + "id=" + id + "  lastName=" + lastName + "  name=" + name + "  middleName=" + middleName
				+ "  address=" + adress + "  cardNumber=" + cardNumber + "  bankNumber=" + bankNumber + '}';
	}
}
