package javarush.syntax.level8;
/*
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
•	Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MapAddAndRemoveDate {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("LastName1", dateFormat.parse("JANUARY 1 2012"));
        map.put("LastName2", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("MAY 1 2012"));
        map.put("LastName4", dateFormat.parse("JUNE 1 2012"));
        map.put("LastName5", dateFormat.parse("JULY 1 2012"));
        map.put("LastName6", dateFormat.parse("AUGUST 1 2012"));
        map.put("LastName7", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("LastName8", dateFormat.parse("OCTOBER 1 2012"));
        map.put("LastName9", dateFormat.parse("NOVEMBER 1 2012"));
        map.put("LastName10", dateFormat.parse("DECEMBER 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        map.values().removeIf(
                date -> date.getMonth() == Calendar.JUNE
                        || date.getMonth() == Calendar.JULY
                        || date.getMonth() == Calendar.AUGUST);
    }

    public static void main(String[] args) {

    }
}
