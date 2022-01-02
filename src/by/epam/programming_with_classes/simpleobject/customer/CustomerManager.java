package by.epam.programming_with_classes.simpleobject.customer;

public class CustomerManager {

	private Customer[] customers;

	public CustomerManager(Customer[] customers) {
		this.customers = customers;
	}

// сортировка покупателей по алфавиту

	public void sortByName() {
		Customer tmp;

		for (int i = 0; i < customers.length; i++) {

			for (int j = customers.length - 1; j > i; j--) {
				int compare = customers[i].name.compareTo(customers[j].name);

				if (compare > 0) {
					tmp = customers[i];
					customers[i] = customers[j];
					customers[j] = tmp;

				} else if (compare == 0) {
					int compare1 = customers[i].lastName.compareTo(customers[j].lastName);

					if (compare1 > 0) {
						tmp = customers[i];
						customers[i] = customers[j];
						customers[j] = tmp;

					} else if (compare1 == 0) {

						if (customers[i].middleName.compareTo(customers[j].middleName) > 0) {
							tmp = customers[i];
							customers[i] = customers[j];
							customers[j] = tmp;
						}
					}
				}
			}
		}
	}

// список покупателей у которых номер карточки в заданном диапазоне

	public void printCustomer(int min, int max) {

		for (int i = 0; i < customers.length; i++) {

			if (customers[i].cardNumber > min && customers[i].cardNumber < max) {
				System.out.println(customers[i].toString());
			}
		}
	}
}
