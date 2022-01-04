package by.epam.programming_with_class.simpleobject.customer;

public class Main {

	public static void main(String[] args) {

		Customer[] customers = new Customer[5];

		customers[0] = new Customer(11, "Bush", "John", "Malkovich", "city Washington", 339, 679011);
		customers[1] = new Customer(10, "Antonov", "Ivan", "Petrovich", "city Samara", 555, 439290);
		customers[2] = new Customer(12, "Kennedy", "Jack", "Maktavish", "city Boston", 450, 383567);
		customers[3] = new Customer(15, "Lindsay", "Jack", "Maktavish", "city Boston", 254, 561615);
		customers[4] = new Customer(14, "Kennedy", "Jack", "Nevish", "city Boston", 331, 124970);

		CustomerManager cust = new CustomerManager(customers);
		
		cust.sortByName();
		cust.printCustomer(0, 1000);
		System.out.println();

		cust.printCustomer(253, 332);
	}
}
