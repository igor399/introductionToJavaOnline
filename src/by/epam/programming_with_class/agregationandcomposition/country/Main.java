package by.epam.programming_with_class.agregationandcomposition.country;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

public class Main {

	public static void main(String[] args) {
	
        City minsk = new City("Минск", 2_009_786);
        Country belarus = new Country("Беларусь", minsk);

        belarus.addRegion(new Region("Минская область", minsk, 39.854));
        belarus.addRegion(new Region("Брестская область", new City("Брест", 340_3), 32.787));
        belarus.addRegion(new Region("Витебская область", new City("Витебск", 362_9), 40.051));
        belarus.addRegion(new Region("Гомельская область", new City("Гомель", 507_7), 40.372));
        belarus.addRegion(new Region("Гродененская область", new City("Гродно", 357_5), 25.127));
        belarus.addRegion(new Region("Могилевская область", new City("Могилёв", 357_4), 29.068));

        belarus.printCapital();
        belarus.printNumberOfRegions();
        belarus.printArea();
        belarus.printRegioCenters();
    }
}

