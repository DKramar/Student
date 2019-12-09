package javarush.syntax.level7;
/*
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считай 10 строк с клавиатуры и добавь их в список.
•	Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
•	Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента,
нарушающего такую упорядоченность.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.util.ArrayList;

public class ArrayList2OrderingCheck {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(); // создаем строчный массив с типом данных стринг
        for (int i = 0; i < 4; i++) { // заполняем массив
            String s = reader.readLine();
            list.add(i, s);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).length() < list.get(i + 1).length()) { /* Ошибка заключалась в том, что когда в цикле переменная i (из условий цикла) становилась равна 9, в теле цикла (внутри оператора if) программа пыталась найти элемент с индексом 10, т.е. list.get(i+1), которого, конечно, не было.*/
            } else {
                System.out.println(i + 1); // вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
                break; // прерываем цикл
            }
        }
    }
}
