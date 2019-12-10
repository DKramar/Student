package javarush.syntax.level7;
/*
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
•	Переставить M первых строк в конец списка.
•	Выведи список на экран, каждое значение с новой строки.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList2Rearrangement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("INPUT NUMBER OF ROWS"); // Вводим количество строк в строчном массиве
        String n1 = reader.readLine();
        int n = Integer.parseInt(n1);

        System.out.println("INPUT NUMBER OF REARRANGEMENT ROWS"); // Вводим количество строк для перестановки
        String m1 = reader.readLine();
        int m = Integer.parseInt(m1);

        System.out.println("INPUT ARRAY LIST"); // Заполняем строчный массив
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            list.add(i, s);
        }

        for (int i = 0; i < m; i++) { // Выполняем перестановку
            String x = list.get(0);
            list.remove(0); //Удали последнюю строку и вставь её в начало. Повторить 13 раз.
            list.add(n-1, x); //вносим первую строку в конец списка
        }

        for (int i = 0; i < list.size(); i++) { // Выводим результат
            System.out.println(list.get(i));
        }
    }
}
