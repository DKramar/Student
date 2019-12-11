package javarush.syntax.level7;
/*
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

Требования:
•	Программа должна считывать 20 целых чисел с клавиатуры.
•	Программа должна выводить 20 чисел.
•	В классе Solution должен быть метод public static void sort(int[] array).
•	Метод main должен вызывать метод sort.
•	Метод sort должен сортировать переданный массив по убыванию.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array1InBackOrder {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Программа должна считывать 20 целых чисел с клавиатуры.
        int[] array = new int[4]; // создаем массив типа int
        for (int i = 0; i < 4; i++) { // заполняем массив введенными с клавиатуры данными
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array); // обращаемся к методу сорт

        for (int x : array) { // результат выводим на печать
            System.out.println(x);
        }
    }

    public static void sort(int[] array) { // создаем метод сорт
        // напишите тут ваш код
        // методом пузырька сортируем массив по убыванию
        for (int i = array.length - 1; i > 0; i--) { // Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний цикл каждый раз ставит в конец фрагмента минимальный элемент
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) { // Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
