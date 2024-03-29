package javarush.syntax.level8;
/*
10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
Sim - 5

Требования:
•	Программа должна создавать переменную коллекции Map с типом элементов String, Object.
Переменная должна быть сразу проинициализирована.
•	Программа не должна считывать значения с клавиатуры.
•	Программа должна добавлять в коллекцию 10 различных объектов, согласно условию.
•	Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.
 */

import java.util.Map;
import java.util.HashMap;

public class CollectionsMapFromObject {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>(); //
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //напишите тут ваш код

        for (Map.Entry<String, Object> pair : map.entrySet()) {
            String key = pair.getKey();                      //ключ
            Object value = pair.getValue();                  //значение
            System.out.println(key + " - " + value); // вывод на экран значения
        }
    }
}
