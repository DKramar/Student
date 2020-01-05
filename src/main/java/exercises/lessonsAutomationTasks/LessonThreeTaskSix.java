package exercises.lessonsAutomationTasks;
/*
Создать еще один класс Main2 с методом main(String[] args), который при запуске выводит в консоль “Hello, world!”.
Создать отдельный пакет ‘com.welcome’.
В нем создать класс Hello, туда добавить методы:
setupName(String name) - присваивает внутренней private переменной имя человека,
welcome() - формирует и выводит в консоль приветствие "Hello, %name%" (имя должно подставляться),
byeBay() - прощается с выводом в консоль фразы "Bye, %name%"
В Main2 классе подключить этот пакет, и вначале программы запросить имя человека, присвоить его переменной класса Hello,
потом поприветствовать его, в конце - попрощаться перед закрытием программы.
Между ‘hello’ и ‘bye’ будет ваше “Hello, world!”.

 */

import exercises.lessonsAutomationTasks.com.welcome.Hello;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LessonThreeTaskSix {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String name = reader.readLine();
        Hello hello = new Hello();
        hello.setupName(name);

        Hello.welcome();
        System.out.println("Hello, world!");
        Hello.byeBay();
    }
}
