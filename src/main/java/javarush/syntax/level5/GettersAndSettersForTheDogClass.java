package javarush.syntax.level5;
/*
Создать class Dog08x10x2019. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog08x10x2019.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Dog08x10x2019 должна быть переменная name с типом String.
•	У класса Dog08x10x2019 должна быть переменная age с типом int.
•	У класса должен быть сеттер для переменной name.
•	У класса должен быть геттер для переменной name.
•	У класса должен быть сеттер для переменной age.
•	У класса должен быть геттер для переменной age.
 */

public class GettersAndSettersForTheDogClass {
    public String name;
    public int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){
    }
}
