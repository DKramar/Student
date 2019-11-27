package javarush.syntax.level7;
/*
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
•	Программа должна добавлять строки в начало списка.
•	Программа должна выводить список на экран, каждое значение с новой строки.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InTheStartOfTheList {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));// ввод данных с клавиатуры.
        ArrayList<String> list = new ArrayList<String>(); //создание массива списка строк
        for (int i = 0; i < 3; i++) { // внесение данных в массив
            String s = reader.readLine();
            list.add(0, s);
        }
        for (int i = 0; i < list.size(); i++) { // перебор данных в массиве
            int j = list.size() - i - 1;
            System.out.println(list.get(j)); // вывод данных на печать
        }
    }
}
