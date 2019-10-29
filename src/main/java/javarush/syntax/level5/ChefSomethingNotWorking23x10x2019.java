package javarush.syntax.level5;
/*
Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.

Требования:
•	Программа должна считывать числа с клавиатуры.
•	В классе должен быть только один метод main.
•	Программа должна выводить строку, которая начинается на "Sum = ".
•	Программа должна выводить строку, которая заканчивается суммой введенных чисел.
 */

import java.io.*;

public class ChefSomethingNotWorking23x10x2019 {
    public static void main (String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("INPUT FIRST NUMBER:");
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);
        System.out.println("INPUT SECOND NUMBER:");
        String b = reader.readLine();
        int b1 = Integer.parseInt(b);

        System.out.println("Sum = " + (a1+b1));
    }
}
