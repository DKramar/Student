package javarush.syntax.level5;
/*
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.

Требования:
•	Программа должна считывать числа с клавиатуры.
•	Программа должна выводить число на экран.
•	В классе должен быть метод public static void main.
•	Нельзя добавлять новые методы в класс Solution.
•	Программа должна выводить на экран максимальное из введенных N чисел.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algorithm23x10x2019 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int number;
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(reader.readLine());
            if (i == 0) maximum = number;
            maximum = number > maximum ? number : maximum;
        }
        System.out.println(maximum);
    }
}
