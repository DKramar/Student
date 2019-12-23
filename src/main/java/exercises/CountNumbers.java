package exercises;

//import javarush.syntax.level3.Scanner;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        int x; // объявил целочисленную переменную х
        x = in.nextInt(); // формат метода ввода целых чисел
        System.out.println("Enter y:");
        int y; // объявил целочисленную переменную у
        y = in.nextInt();
        int res = x + y; // провел операцию сложения
        for (int i = res; i >= 0; i--) { // выполнил обратный отчет
            Thread.sleep(1000); // установил задержку 1 сек
            System.out.print("\r" + i); // результат вывел на печать
        }
    }
}
