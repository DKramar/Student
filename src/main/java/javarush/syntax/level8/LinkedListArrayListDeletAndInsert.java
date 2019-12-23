package javarush.syntax.level8;
/*
10 тысяч удалений и вставок

Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Класс Solution должен содержать только 5 методов.
•	Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
•	Метод get10000(List list) должен вызывать 10 тысяч раз get у списка.
•	Метод set10000(List list) должен вызывать 10 тысяч раз set у списка.
•	Метод remove10000(List list) должен удалять 10 тысяч элементов из списка.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListArrayListDeletAndInsert {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

    }

    public static void get10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }

    }

    public static void set10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.set(i, list);
        }

    }

    public static void remove10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.remove(0);
        }
        /*
        Подсказка remove:
for (int i = 0; i<10000; i++) list.remove(0);
// В цикле мы просто каждый раз удаляем первый элемент, цикл сокращается на 1. и так 10000 раз.

Если удалять элемент i ( list.remove(i)), то:
1)	удаляем элемент 0, размер массива становиться 9 999
2)	удаляем элемент 1, размер массива становиться 9 998
3)	удаляем элемент 2, размер массива становиться 9 997

… где-то в середине цикла, когда надо будет удалить элемент 5000,
размер массива уже будет равен 4999, отсюда ошибка.
         */
    }
}
