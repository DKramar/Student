package javarush.syntax.level4;
/*
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.

Пример:
а) при вводе чисел
2
5
6
получим вывод
количество отрицательных чисел: 0
количество положительных чисел: 3

Пример:
б) при вводе чисел
-2
-5
6
получим вывод
количество отрицательных чисел: 2
количество положительных чисел: 1

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить количество отрицательных чисел в исходном наборе.
•	Программа должна выводить количество положительных чисел в исходном наборе.
•	Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
•	Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
•	Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
 */
import java.io.*;

public class PositiveAndNegativeNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("INPUT FIRST POSITIVE OR NEGATIVE NUMBER");
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);

        System.out.println("INPUT SECOND POSITIVE OR NEGATIVE NUMBER");
        String b = reader.readLine();
        int b1 = Integer.parseInt(b);

        System.out.println("INPUT THIRD POSITIVE OR NEGATIVE NUMBER");
        String c = reader.readLine();
        int c1 = Integer.parseInt(c);

        int p = positive(a1, b1, c1);
        int n = negative(a1, b1, c1);

        if (n>0){
            System.out.println("количество отрицательных чисел: " + n);
        }
        else {
            System.out.println("количество отрицательных чисел: 0");
        }

        if (p>0){
            System.out.println("количество положительных чисел: " + p);
        }
        else {
            System.out.println("количество положительных чисел: 0");
        }
    }

    public static int positive(int aa1, int bb1, int cc1) {
        int positiveCount = 0;

        boolean aa = aa1 > 0;
        if (aa) {
            positiveCount++;
        }
        boolean bb = bb1 > 0;
        if (bb) {
            positiveCount++;
        }
        boolean cc = cc1 > 0;
        if (cc) {
            positiveCount++;
        }

        return positiveCount;
    }

    public static int negative(int aa1, int bb1, int cc1) {
        int negativeCount = 0;

        boolean aa = aa1 < 0;
        if (aa) {
            negativeCount++;
        }
        boolean bb = bb1 < 0;
        if (bb) {
            negativeCount++;
        }
        boolean cc = cc1 < 0;
        if (cc) {
            negativeCount++;
        }
        return negativeCount;
    }
}