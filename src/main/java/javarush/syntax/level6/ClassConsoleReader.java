package javarush.syntax.level6;
/*
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.

Требования:
•	Метод readString должен считывать и возвращать строку(тип String).
•	Метод readInt должен считывать и возвращать число(тип int).
•	Метод readDouble должен считывать и возвращать дробное число(тип double).
•	Метод readBoolean должен считывать и возвращать логическую переменную(тип boolean).
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClassConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        return string;
    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        int number = Integer.parseInt(number1);
        return number;
    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String doub1 = reader.readLine();
        double doub = Double.parseDouble(doub1);
        return doub;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String bool1 = reader.readLine();
        Boolean bool = Boolean.parseBoolean(bool1);
        return bool;
    }

    public static void main(String[] args) throws Exception{

    }
}
