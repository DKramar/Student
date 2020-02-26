package exercises.lessonsAutomationTasks.lecture8.task2;
/*
Написать программу “реверса” строки 5-ю разными способами.
Исходную строку считать с консоли.
Измерить время работы каждого из способов и результаты вывести на консоль.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ВВЕДИТЕ СТРОКУ:");
        String sourceString = reader.readLine();

        StringBuffer forPrint = new StringBuffer(sourceString);
        forPrint.reverse();
        System.out.println("String reverse operation from " + sourceString + " to " + forPrint + " took:");

        // 1-й метод StringBuffer
        long startTime1 = System.nanoTime();
        StringBuffer firstMethod = new StringBuffer(sourceString);
        firstMethod.reverse();
        long endTime1 = System.nanoTime();
        System.out.println("1-th method: " + (endTime1 - startTime1) + " nano seconds");

        // 2-й метод StringBuilder
        long startTime2 = System.nanoTime();
        StringBuilder secondMethod = new StringBuilder(sourceString);
        secondMethod.reverse();
        long endTime2 = System.nanoTime();
        System.out.println("2-th method: " + (endTime2 - startTime2) + " nano seconds");

        // 3-й метод toCharArray (вывод с конца строки)
        long startTime3 = System.nanoTime();
        char[] reverseArray = sourceString.toCharArray();
        for (int i = reverseArray.length - 1; i >= 0; i--) ;
        long endTime3 = System.nanoTime();
        System.out.println("3-th method: " + (endTime3 - startTime3) + " nano seconds");

        // 4-й метод toCharArray (перестановка в цикле)
        long startTime4 = System.nanoTime();
        char[] reverseArray2 = sourceString.toCharArray();
        for (int i = 0, j = reverseArray2.length - 1; i < j; ++i, --j) {
            char tmp = reverseArray2[i];
            reverseArray2[i] = reverseArray2[j];
            reverseArray2[j] = tmp;
        }
        long endTime4 = System.nanoTime();
        System.out.println("4-th method: " + (endTime4 - startTime4) + " nano seconds");

        // 5-й метод charAt
        long startTime5 = System.nanoTime();
        int stringLength = sourceString.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = sourceString.charAt(i) + result;
        }
        long endTime5 = System.nanoTime();
        System.out.println("5-th method: " + (endTime5 - startTime5) + " nano seconds");
    }
}
