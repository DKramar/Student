package javarush.syntax.level8;
/*
Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
картофель - клубень

Требования:
•	Объяви переменную коллекции Map с типом элементов String, String и сразу проинициализируй ee.
•	Программа не должна считывать значения с клавиатуры.
•	Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
•	Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.
 */

import java.util.HashMap;
import java.util.Map;

public class CollectionsMapFromTenCouples {
    public static void main(String[] args) {
        Map<String, String> couples = new HashMap<>(); // Объяви переменную коллекции Map с типом элементов String, String и сразу проинициализируй ee.
        couples.put("арбуз", "ягода"); // Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
        couples.put("банан", "трава");
        couples.put("вишня", "ягода");
        couples.put("груша", "фрукт");
        couples.put("дыня", "овощ");
        couples.put("ежевика", "куст");
        couples.put("жень-шень", "корень");
        couples.put("земляника", "ягода");
        couples.put("ирис", "цветок");
        couples.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : couples.entrySet()) { // Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + " - " + value); // вывод на экран значения
        }
    }

}
