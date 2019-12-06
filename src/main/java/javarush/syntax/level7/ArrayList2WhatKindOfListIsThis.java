package javarush.syntax.level7;
/*
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

Требования:
•	Программа не должна ничего считывать с клавиатуры.
•	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
•	Программа должна добавить 5 любых строк в список.
•	Программа должна вывести размер списка на экран.
•	Программа должна вывести содержимое списка на экран, каждое значение с новой строки.
 */

import java.util.ArrayList;

public class ArrayList2WhatKindOfListIsThis {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // объявляем переменную, инициализируем ее
        for (int i = 0; i < 1; i++) {
            String b = "B"; // объявляем переменные
            String a = "A";
            String c = "C";
            String d = "D";
            String e = "E";
            list.add(0, a); // вносим данные в массив
            list.add(1, b);
            list.add(2, c);
            list.add(3, d);
            list.add(4, e);
        }
        int n = list.size(); // находим размер списка
        System.out.println(n); //выводим размер списка на дисплей
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //выводим содержимое списка
        }
    }
}
