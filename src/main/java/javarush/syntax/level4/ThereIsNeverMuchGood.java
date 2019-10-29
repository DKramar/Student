package javarush.syntax.level4;
/*
Ввести с клавиатуры строку и число N больше 0.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

Пример ввода:
абв
2

Пример вывода:
абв
абв

Требования:
•	Программа должна считывать текст c клавиатуры.
•	Программа должна выводить текст на экран.
•	Каждое значение должно быть выведено с новой строки.
•	Программа должна выводить на экран строку N раз.
•	В программе должен использоваться цикл while.
 */

import java.io.*;
public class ThereIsNeverMuchGood {
    public static void main(String[] args)throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("PRINT A STRING");
        String name = reader.readLine();

        System.out.println("PRINT A POSITIVE NUMBER");
        String num = reader.readLine();
        int num1 = Integer.parseInt(num);

        int num2 = 1;
        while(num2<=num1){
            System.out.println(name);
            num1--;
        }
    }
}
