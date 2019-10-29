package javarush.syntax.level5;
/*
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Нужно создать три объекта типа Cat.
•	Нужно провести три боя.
•	Программа должна вывести результат каждого боя с новой строки.
 */

public class CatFight {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 2, 3, 4);
        Cat cat2 = new Cat("Murzik", 3, 3, 4);
        Cat cat3 = new Cat("Sharik", 2, 3, 2);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }

    public static class Cat {
        protected String name; // переменная класса
        protected int age; // переменная класса
        protected int weight; // переменная класса
        protected int strength; // переменная класса

        public Cat(String name, int age, int weight, int strength) { // имя параметра
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int streigthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + streigthAdvantage;
            return score > 2; //return score > 2 ? true : False;
        }
    }
}
