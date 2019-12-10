package javarush.syntax.level7;
/*
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.

Требования:
•	Создай массив целых чисел (int[]) на 20 элементов.
•	Считай с клавиатуры 20 целых чисел и добавь их в массив.
•	Найди и выведи через пробел максимальное и минимальное числа.
•	Используй цикл for.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1MinMaxInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int[] list = new int[20]; // Создай массив целых чисел (int[]) на 20 элементов.
        for (int i = 0; i < list.length; i++) { // Считай с клавиатуры 20 целых чисел и добавь их в массив.
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }

        int maximum = list[0]; // Найди и выведи через пробел максимальное
        for (int i = 1; i < list.length; i++) {
            maximum = Math.max(maximum, list[i]);
        }

        int minimum = list[0]; // Найди и выведи через пробел минимальное число.
        for (int i = 1; i < list.length; i++) {
            minimum = Math.min(minimum, list[i]);
        }
        System.out.print(maximum + " " + minimum); // Вывод результата на печать
    }
}
