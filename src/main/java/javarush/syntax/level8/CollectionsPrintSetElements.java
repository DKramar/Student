package javarush.syntax.level8;
/*
Вывод на экран элементов Set
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsPrintSetElements {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Stop");
        set.add("Look");
        set.add("Listen");

        Iterator<String> iterator = set.iterator(); // получение итератора для множества

        while (iterator.hasNext()) { // проверка, есть ли еще элементы

            // получение текущего элемента и переход на следующий
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
