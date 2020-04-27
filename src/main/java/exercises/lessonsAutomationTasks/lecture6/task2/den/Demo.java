package exercises.lessonsAutomationTasks.lecture6.task2.den;
/*
Реализовать иерархию двухмерных фигур (круг и квадрат), каждая их которых должна поддерживать следующие операции:
- получить значение площади
- получить координаты центра вписанной окружности
- переопределять методы equals(), clone(), toString()
 */

public class Demo {
    public static void main(String[] args) {
        Figures circle1 = new Circle(2.0,4.4,4.4);
        Figures circle2 = new Circle(3.0,5.5,5.5);
        System.out.printf("%s%n", circle1);
        System.out.printf("The area of the circle = %.2f%n", circle1.area());
        System.out.printf("The coordinates of centre of inscribed circle: %s%n", circle1.centerCoordinate());
        System.out.printf("circle 1 and circle 2 are equals: %s%n", circle1.equals(circle2));

        Figures square1 = new Square(10.4, 2.0, 4.0);
        Figures square2 = new Square(10.4, -6.0, 8.0);
        System.out.printf("%n%s%n", square1);
        System.out.printf("The area of the circle = %.2f%n", square1.area());
        System.out.printf("The coordinates of centre of inscribed circle in square: %s%n", square1.centerCoordinate());
        System.out.printf("Square 1 and square 2 are equals: %s%n", square1.equals(square2));
    }
}
