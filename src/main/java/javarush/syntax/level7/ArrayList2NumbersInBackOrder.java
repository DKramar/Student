package javarush.syntax.level7;
/*
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке. Каждый элемент - с новой строки.
Использовать только цикл for.

Подсказка:
Не забудь импортировать класс: java.util.ArrayList;

Требования:
•	Объяви переменную типа список целых чисел и сразу проинициализируй ee.
•	Считай 10 целых чисел с клавиатуры и добавь их в список.
•	Выведи числа в обратном порядке.
•	Используй цикл for.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList2NumbersInBackOrder {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>(); // объявили строчный массив типа интеджер
        for (int i = 0; i < 10; i++) { // заполнили массив данными
            String s = reader.readLine();
            int l = Integer.parseInt(s);
            list.add(i, l);
        }

        for (int i = list.size() - 1; i >= 0; i--) { // вывели данние массива в обратном порядке
            System.out.println(list.get(i));
        }
    }

}
