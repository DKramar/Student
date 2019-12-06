package javarush.syntax.level7;
/*
Удаление всех чисел больше 5:

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList2DeletingAllNumbersMoreThanFive {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>(); //создаем объект типа строчного массива, типа инт

        while (true) { // заполняем массив данными
            String s = reader.readLine();
            if (s.isEmpty()) break; // при ввод пустой строки - прирываем ввод
            int x = Integer.parseInt(s);
            list.add(0, x);
            for (int i = 0; i < list.size(); i++) { // если число в массиве больше 5, то удаляем его
                if (list.get(i) > 5) list.remove(i);
                else i++;
            }
        }
        for (int i = 0; i < list.size(); i++) { // данние масива выводим на печать
            System.out.println(list.get(i));
        }
    }
}
