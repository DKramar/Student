package exercises.lessonsAutomationTasks.lecture6.examples;

public class App {
    public static void main(String[] args) {
        Cucumber a = new Cucumber("greee", 11);
        Cucumber b = new Cucumber("green", 10);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }
}
