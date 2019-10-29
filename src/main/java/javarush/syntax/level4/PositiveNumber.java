package javarush.syntax.level4;
/*
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.

Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2

б) при вводе чисел
-6
-6
-3
получим вывод
0
в) при вводе чисел
0
1
2
получим вывод
2
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить количество положительных чисел в исходном наборе.
•	Если положительных чисел нет, программа должна вывести "0".
•	Учти, что "0" не относится ни к положительным, ни к отрицательным числам.
 */
import java.io.*;

public class PositiveNumber {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("INPUT NUMBER#1");
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);
        System.out.println("INPUT NUMBER#2");
        String b = reader.readLine();
        int b1 = Integer.parseInt(b);
        System.out.println("INPUT NUMBER#3");
        String c = reader.readLine();
        int  c1 = Integer.parseInt(c);

        int count = 0;

        boolean aa = a1 > 0;
        if (aa) {
            count++;
        }
        boolean bb = b1 > 0;
        if (bb) {
            count++;
        }
        boolean cc = c1 > 0;
        if (cc) {
            count++;
        }
        System.out.println(count);
    }
}
