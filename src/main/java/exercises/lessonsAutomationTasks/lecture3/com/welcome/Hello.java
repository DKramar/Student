package exercises.lessonsAutomationTasks.lecture3.com.welcome;
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

public class Hello {
    private static String name;

    public void setupName(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void welcome(){
        System.out.println("Hello, " + getName());
    }

    public static void byeBay(){
        System.out.println("Bye, " + getName());
    }
}
