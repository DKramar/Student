package javarush.syntax.level5;
/*
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет

Требования:
•	У класса Dog должна быть переменная name с типом String.
•	У класса Dog должна быть переменная height с типом int.
•	У класса Dog должна быть переменная color с типом String.
•	У класса должен быть конструктор, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
•	У класса должен быть конструктор, принимающий в качестве параметров имя, рост и инициализирующий соответствующие переменные класса.
•	У класса должен быть конструктор, принимающий в качестве параметров имя, рост, цвет и инициализирующий соответствующие переменные класса.
 */

public class DogRegistrationConstructors15x10x2019 {
    public String name;
    public int height;
    public String color;

    public DogRegistrationConstructors15x10x2019(String name){
        this.name = name;
    }

    public DogRegistrationConstructors15x10x2019(String name, int height){
        this.name = name;
        this.height = height;
    }

    public DogRegistrationConstructors15x10x2019(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args){
    }
}
