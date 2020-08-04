package javarush.syntax.level8;
/*
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей
по принципу «фамилия» - «зарплата».
•	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
 */

import java.util.HashMap;
import java.util.Map;

public class MapAddAndRemove {

    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Last name 1", 400);
        map.put("Last name 2", 499);
        map.put("Last name 3", 500);
        map.put("Last name 4", 501);
        map.put("Last name 5", 600);
        map.put("Last name 6", 578);
        map.put("Last name 7", 550);
        map.put("Last name 8", 360);
        map.put("Last name 9", 867);
        map.put("Last name 10", 450);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        /*for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();                      //ключ
            Integer value = pair.getValue();                  //значение
            if (value < 500) {
                map.remove(key);
            }
        }*/

        map.values().removeIf(value -> value < 500);
    }

    public static void main(String[] args) {

    }
}

