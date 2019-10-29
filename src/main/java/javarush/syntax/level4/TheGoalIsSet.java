package javarush.syntax.level4;
/*
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.

Пример для чисел 4 6:
1

Пример для чисел -6 -6:
3

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если точка находится в первой координатной четверти, вывести "1".
•	Если точка находится во второй координатной четверти, вывести "2".
•	Если точка находится в третей координатной четверти, вывести "3".
•	Если точка находится в четвёртой координатной четверти, вывести "4".
 */
import java.io.*;

public class TheGoalIsSet {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input #1");
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);
        System.out.println("input#2");
        String b = reader.readLine();
        int b1 = Integer.parseInt(b);
        if(a1>0 && b1>0){
            System.out.println("first quarter");
        }
        else if(a1<0 && b1>0){
            System.out.println("second quarter");
        }
        else if(a1<0 && b1<0){
            System.out.println("third quarter");
        }
        else if(a1>0 && b1<0){
            System.out.println("fourth quarter");
        }
        else if(a1==0 && b1==0){
            System.out.println("base point");
        }
    }
}
