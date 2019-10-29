package javarush.syntax.level4;
/*
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран максимальное из четырёх чисел.
•	Если максимальных чисел несколько, необходимо вывести любое из них.
 */

import java.io.*;

public class MaximumFourNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВЕДИТЕ ПЕРВОЕ ЧИСЛО:");
        String num1 = reader.readLine();
        int a = Integer.parseInt(num1);
        System.out.println("ВВЕДИТЕ ВТОРОЕ ЧИСЛО:");
        String num2 = reader.readLine();
        int b = Integer.parseInt(num2);
        System.out.println("ВВЕДИТЕ ТРЕТЬЕ ЧИСЛО:");
        String num3 = reader.readLine();
        int c = Integer.parseInt(num3);
        System.out.println("ВВЕДИТЕ ЧЕТВЕРТОЕ ЧИСЛО:");
        String num4 = reader.readLine();
        int d = Integer.parseInt(num4);
        if(a>=b && a>=c && a>=d){
            System.out.println(a);
        }
        else if(b>=a && b>=c && b>=d){
            System.out.println(b);
        }
        else if(c>=a && c>=b && c>=d){
            System.out.println(c);
        }
        else if(d>=a && d>=b && d>=c){
            System.out.println(d);
        }
        else {
            System.out.println("числа равны");
        }
    }
}
