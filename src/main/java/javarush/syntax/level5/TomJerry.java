package javarush.syntax.level5;
/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.

Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
 */

public class TomJerry {
    public static void main(String[] args){
        Dog dog = new Dog("Sharik", "Black", 25);
        Cat cat = new Cat("Tom", "Blue", 4);
        Mouse mouse = new Mouse("Jerry", 12, 5);
    }

    public static class Dog{
        String name;
        String color;
        int age;

        public Dog(String name, String color, int age){
            this.name = name;
            this.color = color;
            this.age = age;
        }
    }

    public static class Cat{
        String name;
        String color;
        int paws;

        public Cat(String name, String color, int paws){
            this.name = name;
            this.color = color;
            this.paws = paws;
        }
    }

    public static class Mouse{
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail){
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
