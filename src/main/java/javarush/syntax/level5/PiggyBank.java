package javarush.syntax.level5;
/*
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.

Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit", можно с помощью следующей конструкции:

BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	if (s.equals("exit"))
		break;
}
Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна прекращать считывать данные с клавиатуры после того пользователь введет слово «сумма» в нижнем регистре и нажмет Enter.
•	Программа должна корректно работать, если пользователь ввел одно число и слово «сумма».
•	Программа должна корректно работать, если пользователь ввел два числа и слово «сумма».
•	Программа должна корректно работать, если пользователь ввел более двух чисел и слово «сумма».
•	Программа должна выводить текст на экран.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PiggyBank {
    public static void main(String[]args) throws Exception{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("FOR GET A SUM INPUT NUMBERS. FOR EXIT: EXIT");
        int sum = 0;

        while (true) {
            String s = buffer.readLine();
            if (s.equals("сумма")) {
                System.out.println(sum);
                break;
            }
            int s1 = Integer.parseInt(s);
            sum = sum+s1;
        }
    }
}
