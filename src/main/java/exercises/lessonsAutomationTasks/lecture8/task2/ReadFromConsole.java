package exercises.lessonsAutomationTasks.lecture8.task2;
/*
Написать программу “реверса” строки 5-ю разными способами.
Исходную строку считать с консоли.
Измерить время работы каждого из способов и результаты вывести на консоль.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadFromConsole {
    public static final String promptText = "ENTER STRING:";

    // метод ввода строки с консоли
    public static String readStringFromConsole() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(promptText);
        return reader.readLine();
    }
}
