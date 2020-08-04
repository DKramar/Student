package javarush.syntax.level8;
/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
•	Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
•	Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
 */

import java.util.HashMap;
import java.util.Map;

public class MapAddAndCompare {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Last name1", "First name 1");
        map.put("Last name2", "First name 2");
        map.put("Last name3", "First name 3");
        map.put("Last name4", "First name 4");
        map.put("Last name5", "First name 1");
        map.put("Last name6", "First name 5");
        map.put("Last name7", "First name 1");
        map.put("Last name8", "First name 6");
        map.put("Last name9", "First name 1");
        map.put("Last name10", "First name 7");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int countFirstName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name))
                countFirstName++;
        }
        return countFirstName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int countLastName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName))
                countLastName++;
        }
        return countLastName;
    }

    public static void main(String[] args) {
    }
}
