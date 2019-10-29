package javarush.syntax.level5;
/*
Разберись, что делает программа.
Исправь конструктор с двумя параметрами так, чтобы он вызывал другой конструктор с радиусом 10.
Подумай, какой конструктор нужно вызвать.
Подсказка:
внимательно изучи реализацию конструктора по умолчанию.

Требования:
•	У класса должно быть 3 конструктора.
•	Конструктор с двумя параметрами должен инициализировать переменные x и y переданными значениями.
•	Конструктор с двумя параметрами должен инициализировать переменную radius значением 10.
•	Конструктор с двумя параметрами должен вызывать другой конструктор, передав в него верные значения параметров.
•	Метод main не изменять.
•	Конструктор по умолчанию не изменять.
 */

public class CircleConstructors15x10x2019 {

    public double x;
    public double y;
    public double radius;

    public CircleConstructors15x10x2019(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public CircleConstructors15x10x2019(double x, double y) {
            //напишите тут ваш код
        this(x,y,10.0);
    }

    public CircleConstructors15x10x2019() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
    CircleConstructors15x10x2019 circleConstructors15x10x2019 = new CircleConstructors15x10x2019();
    System.out.println(circleConstructors15x10x2019.x + " " + circleConstructors15x10x2019.y + " " + circleConstructors15x10x2019.radius);
    CircleConstructors15x10x2019 anotherCircleConstructors15x10x2019 = new CircleConstructors15x10x2019(10, 5);
    System.out.println(anotherCircleConstructors15x10x2019.x + " " + anotherCircleConstructors15x10x2019.y + " " + anotherCircleConstructors15x10x2019.radius);
    }
}