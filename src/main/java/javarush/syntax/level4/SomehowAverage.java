package javarush.syntax.level4;
/*
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить среднее из трех чисел.
•	Если все числа равны, вывести любое из них.
•	Если два числа из трех равны, вывести любое из двух.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SomehowAverage {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("INPUT FIRST NUMBER:");
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);

        System.out.println("INPUT SECOND NUMBER:");
        String b = reader.readLine();
        int b1 = Integer.parseInt(b);

        System.out.println("INPUT THIRD NUMBER:");
        String c = reader.readLine();
        int c1 = Integer.parseInt(c);

        if (a1==b1 && b1==c1 || a1==b1 && a1!=c1) {
            System.out.println(a1);
        }
        if (b1==c1 && b1!=a1) {
            System.out.println(b1);
        }
        if (a1==c1 && a1!=b1) {
            System.out.println(a1);
        }
        if (a1>b1 && b1>c1){
            System.out.println(b1);
        }
        if (a1<b1 && b1<c1){
            System.out.println(b1);
        }
        if (a1>b1 && b1<c1 && a1<c1){
            System.out.println(a1);
        }
        if (a1<b1 && b1>c1 && a1>c1){
            System.out.println(a1);
        }
        if (a1<b1 && b1>c1 && a1<c1){
            System.out.println(c1);
        }
        if (a1>b1 && b1<c1 && a1>c1){
            System.out.println(c1);
        }
    }
}
