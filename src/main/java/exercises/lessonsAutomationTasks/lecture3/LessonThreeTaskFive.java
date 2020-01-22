package exercises.lessonsAutomationTasks.lecture3;
/*
Создать простой Java-проект (консольное приложение), которое при запуске выводит в консоль “Hello, world!”.
Добавить метод printHelloName(), который будет запрашивать у пользователя ввести имя,
считывать введенное имя с консоли и выводить на экран приветствие “Hello, %name%”.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LessonThreeTaskFive {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, world!");
        printHelloName();
    }

    private static void printHelloName() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String name = reader.readLine();
        System.out.println("Hello, " + name + "!");
    }
}
