package javarush.syntax.level4;
/*
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить числа на экран.
•	Программа должна выводить три числа разделенных пробелами.
•	Программа должна выводить числа в порядке убывания.
 */
import java.io.*;

public class SortThreeNumbers {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВЕДИТЕ ЧИСЛО №1");
        String num1 = reader.readLine();
        int a = Integer.parseInt(num1);
        System.out.println("ВВЕДИТЕ ЧИСЛО №2");
        String num2 = reader.readLine();
        int b = Integer.parseInt(num2);
        System.out.println("ВВЕДИТЕ ЧИСЛО №3");
        String num3 = reader.readLine();
        int c = Integer.parseInt(num3);
        if(a>b && a>c) {
            if (b>c) {
                System.out.println(a + " " + b + " " + c);
            }
            if (b<c) {
                System.out.println(a + " " + c + " " + b);
            }
        }
        if(b>a && b>c){
            if(a>c){
                System.out.println(b + " " + a + " " + c);
            }
            if(a<c){
                System.out.println(b + " " + c + " " + a);
            }
        }
        if(c>a && c>b){
            if(a>b){
                System.out.println(c + " " + a + " " + b);
            }
            if(a<b){
                System.out.println(c + " " + b + " " + a);
            }
        }
        if(a==b && a>c){
            System.out.println(a + " " + b + " " + c);
        }
        if(a==b && a<c){
            System.out.println(c + " " + a + " " + b);
        }
        if(a==c && a>b){
            System.out.println(a + " " + c + " " + b);
        }
        if(a==c && a<b){
            System.out.println(b + " " + a + " " + c);
        }
        if(b==c && a>c){
            System.out.println(a + " " + b + " " + c);
        }
        if(b==c && a<c){
            System.out.println(c + " " + b + " " + a);
        }
        if(a==b && b==c){
            System.out.println("ЧИСЛА " + a + " " + b + " " + c + " РАВНЫ");
        }
    }
}
