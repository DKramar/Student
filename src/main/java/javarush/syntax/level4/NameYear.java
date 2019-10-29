package javarush.syntax.level4;
/*
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988

Требования:
•	Программа должна считывать строки c клавиатуры.
•	Программа должна выводить строки на экран.
•	Программа должна выводить текст, шаблон которого указан в задании.
•	Каждое предложение вывести с новой строки.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NameYear {
    public static void main(String [] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("INPUT NAME:");
        String name = reader.readLine();

        System.out.println("INPUT YEAR:");
        String year = reader.readLine();

        System.out.println("INPUT MONTH:");
        String month = reader.readLine();

        System.out.println("DAY:");
        String day = reader.readLine();

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + day + "." + month + "." + year);
    }
}
