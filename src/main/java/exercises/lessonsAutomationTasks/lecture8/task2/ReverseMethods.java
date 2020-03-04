package exercises.lessonsAutomationTasks.lecture8.task2;
/*
Написать программу “реверса” строки 5-ю разными способами.
Исходную строку считать с консоли.
Измерить время работы каждого из способов и результаты вывести на консоль.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseMethods {
    private String stringRevers = readStringFromConsole("ENTER STRING:");

    public ReverseMethods() throws Exception {
    }

    // метод ввода строки с консоли
    public String readStringFromConsole(String string) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(string);
        return reader.readLine();
    }

    // 1 STRING BUFFER
    public StringBuffer StringBufferReverse() {
        StringBuffer firstMetod = new StringBuffer(stringRevers);
        return firstMetod.reverse();
    }

    public long StringBufferTime() {
        StringBuffer first = new StringBuffer(stringRevers);
        long startTime = System.nanoTime();
        first.reverse();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // 2 STRING BUILDER
    public StringBuilder StringBuilderReverse() {
        StringBuilder second = new StringBuilder(stringRevers);
        return second.reverse();
    }

    public long StringBuilderTime() {
        StringBuilder second = new StringBuilder(stringRevers);
        long startTime = System.nanoTime();
        second.reverse();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // 3-й метод toCharArray (вывод с конца строки)
    public String reverseStringWithRecursion() {
        String rightPart;
        String leftPart;

        int length = stringRevers.length();

        // заканчиваем рекурсивный обход
        if (length <= 1) {
            return stringRevers;
        }

        leftPart = stringRevers.substring(0, length / 2);

        rightPart = stringRevers.substring(length / 2, length);

        // рекурсивно переворачиваем левую и правую часть входной строки
        return reverseStringWithRecursion(rightPart) + reverseStringWithRecursion(leftPart);
    }

    // 4 toCharArray (перестановка в цикле)
    public Object toCharArrayReverse() {
        char[] reverseArray = stringRevers.toCharArray();
        String result = "";
        for (int i = 0, j = reverseArray.length - 1; i < j; ++i, --j) {
            char tmp = reverseArray[i];
            reverseArray[i] = reverseArray[j];
            reverseArray[j] = tmp;
        }
        for (int i = reverseArray.length - 1; i >= 0; i--) {
            result = reverseArray[i] + result;
        }
        return result;
    }

    public long toCharArrayTime() {
        char[] reverseArray = stringRevers.toCharArray();
        long startTime = System.nanoTime();
        for (int i = 0, j = reverseArray.length - 1; i < j; ++i, --j) {
            char tmp = reverseArray[i];
            reverseArray[i] = reverseArray[j];
            reverseArray[j] = tmp;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // 5-й метод charAt
    public String charAtReverse() {
        int stringLength = stringRevers.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = stringRevers.charAt(i) + result;
        }
        return result;
    }

    public long charAtTime() {
        int stringLength = stringRevers.length();
        String result = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < stringLength; i++) {
            result = stringRevers.charAt(i) + result;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    @Override
    public String toString() {
        return stringRevers;
    }
}
