package javarush.syntax.level7;
/*
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

Требования:
•	Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет главным, а остальные - дополнительными.
•	Считать 20 чисел с клавиатуры и добавить их в главный список.
•	Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
•	Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
•	Добавить в третий дополнительный список все остальные числа из главного.
•	Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
•	Программа должна вывести три дополнительных списка, используя метод printList.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList2Cinderella {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>(); // создал строчный массив
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> listOther = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) { // заполнил строчный массив
            String s = reader.readLine();
            int l = Integer.parseInt(s);
            list.add(i, l);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0 && list.get(i) % 2 == 0) { // условие деления на 2 и 3
                list3.add(0, list.get(i)); // добавляю число в новый список
                list2.add(0, list.get(i)); // добавляю число в новый список
            }
            if (list.get(i) % 3 == 0 && list.get(i) % 2 != 0) { // условие деления на 3
                list3.add(0, list.get(i)); // добавляю число в новый список
            }
            if (list.get(i) % 2 == 0 && list.get(i) % 3 != 0) { // условие деления на 2
                list2.add(0, list.get(i)); // добавляю число в новый список
            }
            if (list.get(i) % 3 != 0 && list.get(i) % 2 != 0) { // условие если не делится на 3 и 2
                listOther.add(0, list.get(i)); // добавляю число в новый список
            }
        }
        System.out.println("делится на 3");
        printList(list3); // передаю список для печати
        System.out.println("делится на 2");
        printList(list2); // передаю список для печати
        System.out.println("не делится на 3 и 2");
        printList(listOther); // передаю список для печати
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer output : list) {
            System.out.println(output); // печатаю переданный список
        }
    }
}
