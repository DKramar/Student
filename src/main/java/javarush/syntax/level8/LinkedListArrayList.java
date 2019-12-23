package javarush.syntax.level8;

import java.util.ArrayList;

/*
Нужно создать два списка - LinkedList и ArrayList.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Программа должна содержать только три метода.
•	Метод createArrayList() должен создавать и возвращать список ArrayList.
•	Метод createLinkedList() должен создавать и возвращать список LinkedList.
 */
import java.util.ArrayList;
import java.util.LinkedList;


public class LinkedListArrayList {
    public static Object createArrayList() {
        //напишите тут ваш код
        ArrayList arrayList = new ArrayList(); // Метод createArrayList() должен создавать и возвращать список ArrayList.
        return arrayList;
    }

    public static Object createLinkedList() {
        //напишите тут ваш код
        LinkedList linkedList = new LinkedList(); // Метод createLinkedList() должен создавать и возвращать список LinkedList.
        return linkedList;
    }

    public static void main(String[] args) {

    }
}
