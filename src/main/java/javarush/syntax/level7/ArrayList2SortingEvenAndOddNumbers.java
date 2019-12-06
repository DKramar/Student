package javarush.syntax.level7;
/*
Чётные числа добавляются в конец списка, нечётные — в начало.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList2SortingEvenAndOddNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>(); // Создаем новый объект типа строчного массива типа Integer

        while (true) { // заполняем массив до тех пор пока не будет пустой строки
            String s = reader.readLine();
            if (s.isEmpty()) break;

            int x = Integer.parseInt(s);
            if (x % 2 == 0) list.add(x); // проверяем, что остаток от деления на два равен нулю. Добавляем в конец
            else list.add(0, x); // вставка в начало
        }

        for (int i = 0; i < list.size(); i++) { // выводим содержимое массива на печать
            System.out.println(list.get(i));
        }
    }
}
