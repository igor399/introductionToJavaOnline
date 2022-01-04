package by.epam.basic_of_oop.task5;

import static by.epam.basic_of_oop.task5.sweetness.SweetnessType.*;

import by.epam.basic_of_oop.task5.sweetness.SweetnessFactory;
import by.epam.basic_of_oop.task5.wrap.WrapFactory;
import by.epam.basic_of_oop.task5.wrap.WrapType;

public class Main {

	public static void main(String[] args) {
		Present present = new Present();
		SweetnessFactory sweetnessFactory = new SweetnessFactory();
		
		present.addSweetness(sweetnessFactory.createSweetness(CAKE, "Blueberyy", 12));
		present.addSweetness(sweetnessFactory.createSweetness(CANDY, "Caramel Antoshka", 11));
        present.addSweetness(sweetnessFactory.createSweetness(COOKIE, "Funny Cookie", 99));
        present.addSweetness(sweetnessFactory.createSweetness(DONUT, "Donut of America", 6));

        WrapFactory wrapFactory = new WrapFactory();

        present.setWrap(wrapFactory.createWrap(WrapType.BASKET, "Easy Way", "Cotton 100%"));

        System.out.println(present);
    }
}

