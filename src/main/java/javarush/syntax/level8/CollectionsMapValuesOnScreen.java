package javarush.syntax.level8;
/*
Есть коллекция Map<String, String> (реализация HashMap), туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.

Требования:
•	Программа должна создавать переменную коллекции Map с типом элементов String, String.
Переменная должна быть сразу проинициализирована.
•	Программа не должна считывать значения с клавиатуры.
•	Программа должна добавлять в коллекцию 10 различных строк, согласно условию.
•	Метод printValues() должен выводить на экран список значений коллекции, каждый элемент с новой строки.
 */

import java.util.Map;
import java.util.HashMap;

public class CollectionsMapValuesOnScreen {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim"); // объявили переменные
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map); // объявили метод printValues
    }

    public static void printValues(Map<String, String> map) { // метод printValues
        //напишите тут ваш код
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            //String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(value); // вывод на экран значения
        }
    }
}
