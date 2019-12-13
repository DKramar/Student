package javarush.syntax.level8;
/*
Вывод на экран элементов List
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionPrintListElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Mama");
        list.add("Mila");
        list.add("Ramu");

        Iterator<String> iterator = list.iterator(); // получение итератора для списка
        while (iterator.hasNext()) { // проверка. есть ли еще элементы
            // получение текущего элемента и переход на следующий
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
