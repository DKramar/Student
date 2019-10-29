package javarush.syntax.level5;
/*
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол

Примечание:
Имя(String), возраст(int), пол(char).

Требования:
•	У класса Friend должна быть переменная name с типом String.
•	У класса Friend должна быть переменная age с типом int.
•	У класса Friend должна быть переменная sex с типом char.
•	У класса должен быть метод initialize, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
•	У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий соответствующие переменные класса.
•	У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст, пол и инициализирующий соответствующие переменные класса.
 */

public class CreateFriendClass08x10x2019 {
    public String name; // объявил переменную класса
    public int age; // объявил переменную класса
    public char sex; // объявил переменную класса

    public void initialize(String name) { // создал метод с параметром name
        this.name = name; // переменой присвоил параметр
    }

    public void initialize(String name, int age){ // создал метд с параметром name и age
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, char sex){ // создал метод с параметром name и age и sex
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args){

    }
}
