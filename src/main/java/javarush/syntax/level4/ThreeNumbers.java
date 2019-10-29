package javarush.syntax.level4;
/*
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна использовать команды System.out.println() или System.out.print().
•	Программа должна выводить на экран порядковый номер числа, отличного от остальных.
•	Если все числа разные, ничего не выводить.
 */
import java.io.*;

public class ThreeNumbers {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input #1");
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);
        System.out.println("input #2");
        String b = reader.readLine();
        int b1 = Integer.parseInt(b);
        System.out.println("input #3");
        String c = reader.readLine();
        int c1 = Integer.parseInt(c);
        if (a1==b1 && a1==c1){
            System.out.println("equals numbers");
        }
        else if(a1==b1){
            System.out.println("different #3");
        }
        else if(a1==c1){
            System.out.println("different #2");
        }
        else if(b1==c1){
            System.out.println("different #1");
        }
        else{
            System.out.println("All numbers are different");
        }
    }
}
