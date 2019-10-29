package javarush.syntax.level5;
/*
В классе CircleConstructors15x10x2019 создать конструктор который проинициализирует все переменные класса.
В конструкторе должно быть три аргумента.

Требования:
•	У класса CircleConstructors15x10x2019 должны быть переменные x, y и r с типом double.
•	У класса должен быть один конструктор.
•	Конструктор должен быть public.
•	Конструктор должен иметь три параметра типа double.
•	Конструктор должен проинициализировать все переменные класса.
 */

public class BasisOfTheCircleConstructors15x10x2019 {
    public double x;
    public double y;
    public double r;

    public BasisOfTheCircleConstructors15x10x2019(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public static void main (String [] args){

    }
}
