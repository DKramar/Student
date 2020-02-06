package exercises.abstractExampl;

public abstract class Person {
    private String name; // Обявил параметр класса

    public Person(String name) {
        this.name = name; // создал конструктор для имени
    }

    public String getName() { // геттер
        return name;
    }

    public abstract void display(); // абстрактный метод
}
