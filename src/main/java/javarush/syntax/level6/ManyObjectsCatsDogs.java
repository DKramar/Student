package javarush.syntax.level6;
/*
Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).

Требования:
•	В классе Cat должен быть void метод finalize.
•	В классе Dog должен быть void метод finalize.
•	Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
•	Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".
•	Метод main должен создавать 50000 объектов типа Cat и 50000 объектов типа Dog.
 */

public class ManyObjectsCatsDogs {
    public static void main(String[] args) {
        for (int i = 0; i < 50000; i++) {
            Cat cat = new Cat();
            cat = null;
        }

        for (int j = 0; j < 50000; j++) {
            Dog dog = new Dog();
            dog = null;
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
