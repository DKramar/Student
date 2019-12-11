package javarush.syntax.level7;
/*
Задача: Программа вводит с клавиатуры данные про котов и выводит их на экран.

Пример:
Cat's name: Barsik, age: 6, weight: 5, tail: 22
Cat's name: Murka, age: 8, weight: 7, tail: 20

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Если пользователь ввел пустую строку вместо имени, то программа должна вывести данные на экран и завершиться.
•	Если пользователь ввел: Barsik, 6, 5 и 22 (каждое значение с новой строки), то программа должна вывести "Cat's name: Barsik, age: 6, weight: 5, tail: 22".
•	Если пользователь ввел: Murka, 8, 7 и 20 (каждое значение с новой строки), то программа должна вывести "Cat's name: Murka, age: 8, weight: 7, tail: 20".
•	Если пользователь ввел: Barsik, 6, 5, 22, Murka, 8, 7 и 20 (каждое значение с новой строки), то программа должна
вывести две строки: "Cat's name: Barsik, age: 6, weight: 5, tail: 22" и "Cat's name: Murka, age: 8, weight: 7, tail: 20".
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList2ObjectClassesCats {
    public final static ArrayList<Cat> CATS = new ArrayList<Cat>(); // объявили строчный массив

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) { // заполняем массив данными
            String name = reader.readLine(); // имя стринг
            if (name == null || name.isEmpty()) { // если имя равно нулю или пустое значение, то прирываем ввод
                break;
            }

            int age = Integer.parseInt(reader.readLine()); // объявляем переменные возраст
            int weight = Integer.parseInt(reader.readLine()); // объявляем переменные рост
            int tail = Integer.parseInt(reader.readLine()); // объявляем переменные хвост
            Cat cat = new Cat(name, age, weight, tail); // создаем объект, присваиваем ссылку
            CATS.add(cat); // добавляем данные в массив
        }

        printList(); // объявляем метод принтлист
    }

    public static void printList() { // данные массива выводим на печать
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat { // создаем класс кота
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) { // создаем конструктор
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}
