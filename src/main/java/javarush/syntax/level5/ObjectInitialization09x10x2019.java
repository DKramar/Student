package javarush.syntax.level5;
/*
Изучи внимательно класс Person.
Исправь класс так, чтобы только один метод initialize инициализировал все переменные класса Person.

Требования:
Программа не должна считывать данные с клавиатуры.
У класса Person должно быть 5 переменных.
У класса должен быть один метод initialize.
Метод initialize должен иметь пять параметров.
 */

public class ObjectInitialization09x10x2019 {

    public class Person { // создали класс Person
        String name; // объявили переменную класса
        char sex;
        int money;
        int weight;
        double size;

        public void initialize(String name, int money, char sex, int weight, double size) { // создали метод с пятью параметрами
            this.name = name; // присвоили переменной класса параметр
            this.money = money;
            this.sex = sex;
            this.weight = weight;
            this.size = size;
        }
    }
        public static void main(String[] args) { // основной метод main
        }
    }

