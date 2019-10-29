package javarush.syntax.level5;
/*
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол

Требования:
•	У класса Friend должна быть переменная name с типом String.
•	У класса Friend должна быть переменная age с типом int.
•	У класса Friend должна быть переменная sex с типом char.
•	У класса должен быть конструктор, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
•	У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий соответствующие переменные класса.
•	У класса должен быть конструктор, принимающий в качестве параметров имя, возраст, пол и инициализирующий соответствующие переменные класса.
 */

public class FriendsСonstructors15x10x2019 {
    public String name;
    public int age;
    public char sex;

    public FriendsСonstructors15x10x2019(String name){
        this.name = name;
    }

    public FriendsСonstructors15x10x2019(String name, int age){
        this.name = name;
        this.age = age;
    }

    public FriendsСonstructors15x10x2019(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[]args){
    }
}
