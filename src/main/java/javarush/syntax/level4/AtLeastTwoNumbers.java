package javarush.syntax.level4;
/*
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран минимальное из двух целых чисел.
•	Если два числа равны между собой, необходимо вывести любое.
 */
import java.io.*;

public class AtLeastTwoNumbers {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВЕДИТЕ ПЕРВОЕ ЦЕЛОЕ ЧИСЛО:");
        String num1 = reader.readLine();
        int num1Int = Integer.parseInt(num1);
        System.out.println("ВВЕДИТЕ ВТОРОЕ ЦЕЛОЕ ЧИСЛО:");
        String num2 = reader.readLine();
        int num2Int = Integer.parseInt(num2);

        if(num1Int<num2Int){
            System.out.println("МИНИМАЛЬНОЕ ИЗ ЦЕЛЫХ ЧИСЕЛ " + num1Int + " И " + num2Int + " = " + num1Int);
        }
        else if(num1Int == num2Int){
            System.out.println(num1Int + " РАВНО " + num2Int);
        }
        else{
            System.out.println("МИНИМАЛЬНОЕ ИЗ ЦЕЛЫХ ЧИСЕЛ " + num1Int + " И " + num2Int + " = " + num2Int);
        }
    }
}
