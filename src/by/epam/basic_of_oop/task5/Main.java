package by.epam.basic_of_oop.task5;

//Создать консольное приложение, удовлетворяющее следующим требованиям:
//• Корректно спроектируйте и реализуйте предметную область задачи.
//• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
//• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
//• для проверки корректности переданных данных можно применить регулярные выражения.
//• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
//• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
//Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции (объект, представляющий собой цветочную композицию). 
//Составляющими цветочной композиции являются цветы и упаковка.
//Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок). 
//Составляющими целого подарка являются сладости и упаковка.

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

