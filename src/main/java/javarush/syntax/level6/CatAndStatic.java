package javarush.syntax.level6;
/*
В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная catCount
увеличивается на 1. Создать 10 объектов Cat и вывести значение переменной catCount на экран.

Требования:
•	В классе Cat создай статическую переменную public int catCount.
•	В классе Cat создай конструктор public Cat() без параметров.
•	Конструктор должен увеличивать значение статической переменной catCount на 1.
•	В методе main создай 10 котов.
•	В методе main, после создания всех котов, выведи значение переменной catCount.
 */

public class CatAndStatic {
    public static void main(String[] args) {
        // Создай 10 котов
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();

        // Выведи значение переменной catCount
        System.out.println(Cat.catCoutn);
    }

    public static class Cat {
        // Создай статическую переменную catCount
        public static int catCoutn;

        // Создай конструктор
        public Cat(){
            Cat.catCoutn++;
        }
    }
}
