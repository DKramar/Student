package javarush.syntax.level8;
/*
Реализовать 4 метода.
Каждый из них должен возвращать список, который лучше всего подходит для выполнения данных операций
(быстрее всего справится с большим количеством операций).
Ничего измерять не нужно.

Требования:
•	Программа не должна выводить текст на экран.
•	Класс Solution должен содержать только 5 методов.
•	Метод getListForGet должен возвращать список, который лучше всего подходит для операции взятия элемента.
•	Метод getListForSet должен возвращать список, который лучше всего подходит для установки значения элемента.
•	Метод getListForAddOrInsert должен возвращать список, который лучше всего подходит для операций добавления
или вставки элемента.
•	Метод getListForRemove должен возвращать список, который лучше всего подходит для операции удаления элемента.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListArrayListQuartedMethods {
    public static List getListForGet() {
        //напишите тут ваш код
        ArrayList get = new ArrayList(); // + быстрый доступ по индексу, быстрый перебор элементов коллекции. - Медленная вставка, добавление, удаление элементов
        return get;
    }

    public static List getListForSet() {
        //напишите тут ваш код
        ArrayList set = new ArrayList();
        return set;
    }

    public static List getListForAddOrInsert() {
        //напишите тут ваш код
        LinkedList insert = new LinkedList(); // + Вставка и удаление происходит быстро. - Доступ по индексуосуществляется медленно
        return insert;
    }

    public static List getListForRemove() {
        //напишите тут ваш код
        LinkedList remove = new LinkedList();
        return remove;
    }

    public static void main(String[] args) {

    }
}
