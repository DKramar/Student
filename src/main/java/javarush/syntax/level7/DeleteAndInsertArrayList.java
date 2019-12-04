package javarush.syntax.level7;
/*
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 5 строк с клавиатуры.
•	Удали последнюю строку и вставь её в начало. Повторить 13 раз.
•	Программа должна выводить список на экран, каждое значение с новой строки.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DeleteAndInsertArrayList {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(); //Объяви переменную типа список строк и сразу проинициализируй ee.
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine(); //Программа должна считывать 5 строк с клавиатуры.
            list.add(i, s);
        }

        for (int j = 0; j < 13; j++) {
            String n = list.get(list.size() - 1); //Копируем последнюю строку
            list.remove(list.size() - 1); //Удали последнюю строку и вставь её в начало. Повторить 13 раз.
            list.add(0, n); //вносим последнюю строку в начало
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); //выводим последнюю строку на печать
        }
    }
}
