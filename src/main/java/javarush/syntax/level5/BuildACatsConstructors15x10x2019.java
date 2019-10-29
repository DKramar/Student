package javarush.syntax.level5;
/*
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.

Требования:
•	У класса Cat должна быть переменная name с типом String.
•	У класса Cat должна быть переменная age с типом int.
•	У класса Cat должна быть переменная weight с типом int.
•	У класса Cat должна быть переменная address с типом String.
•	У класса Cat должна быть переменная color с типом String.
•	У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть конструктор, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
•	У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
 */

public class BuildACatsConstructors15x10x2019 {
    public String name; //объявил переменную
    public int age;
    public int weight;
    public String address;
    public String color;

    public BuildACatsConstructors15x10x2019(String name){
        this.name = name;
        age = 5; // инициализировал переменную класса
        weight = 8; // инициализиовал переменную класса
        address = null;
        color = "Gray";
    }
    public BuildACatsConstructors15x10x2019(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        address = null;
        color = "Gray";
    }

    public BuildACatsConstructors15x10x2019(String name, int age){
        this.name = name; //конструктор принимает в качестве параметра имя
        this.age = age; // конструктор принимающий в качестве параматра возраст
        weight = 8;
        address = null;
        color = "Gray";
    }

    public BuildACatsConstructors15x10x2019(int weight, String color){
        this.weight = weight;
        this.color = color;
        name = null;
        address = null;
        age = 5;
    }

    public BuildACatsConstructors15x10x2019(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        name = null;
        age = 5;
    }

    public static void main(String[] args){

    }
}
