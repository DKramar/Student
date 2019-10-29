package javarush.syntax.level5;
/*
Изучи класс CircleConstructors15x10x2019. Напиши максимальное количество конструкторов с разными аргументами.

Подсказка:
не забудь про конструктор по умолчанию.

Требования:
•	У класса должно быть хотя бы три переменные.
•	У класса должен быть конструктор по умолчанию.
•	У класса должен быть хотя бы один конструктор.
•	У класса должно быть хотя бы два конструктора.
•	У класса должно быть хотя бы три конструктора.
•	У класса должно быть хотя бы четыре конструктора.
 */

public class MaxConstructors15x10x2019 {
    public double x;
    public double y;
    public double radius;

    public MaxConstructors15x10x2019(double x){
        this.x = x;
    }

    public MaxConstructors15x10x2019(double x, double y){
        this.x = x;
        this.y = y;
    }

    public MaxConstructors15x10x2019(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public MaxConstructors15x10x2019(){
        x = 1.0;
        y = 2.5;
        radius = 150.2;
    }

    public static void main(String[] args){

    }
}
