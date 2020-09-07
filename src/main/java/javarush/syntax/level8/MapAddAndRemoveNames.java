/*
package javarush.syntax.level8;
*/
/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
•	Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
•	Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
 *//*


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapAddAndRemoveNames {
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> copy = new ArrayList<String>(value);
        for(String deleted : copy) {
            int count = 0;
            for(Map.Entry<String, String> twin : map.entrySet())
                if(deleted.equals(twin.getValue())) count++;
            if(count < 2) value.remove(deleted);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
*/
