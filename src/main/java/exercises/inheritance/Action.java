package exercises.inheritance;

public class Action {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
        System.out.println();
        cat.meow();

        Dog dog = new Dog();
        dog.bark();
    }
}
