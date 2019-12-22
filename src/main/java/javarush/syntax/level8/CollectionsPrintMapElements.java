package javarush.syntax.level8;
/*
Вывод на экран элементов Map
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionsPrintMapElements {
    public static void main(String[] args)
    {
        //все элементы хранятся в парах
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("third", "Ramu");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + ":" + value);
        }
    }
}
/*
— Ничего себе! И что все это значит?

— На самом деле все довольно просто. Сначала мы получаем у коллекции специальный объект-iterator. У него есть всего два метода

1. Метод next() возвращает очередной элемент коллекции.

2. Метод hasNext() проверяет, есть ли еще элементы, которые не возвращал next().

— Ага. Похоже ситуация начинает проясняться. Давай я расскажу, как я все это понял.

— Так. Сначала надо вызвать у коллекции метод iterator(), чтобы получить этот волшебный объект-итератор.

— Затем мы в цикле, пока есть еще неполученные элементы, получаем их по одному. Получаем мы очередной элемент коллекции
с помощью вызова next(), а проверяем, есть ли еще элементы в итераторе с помощью hasNext(). Все верно?
 */
