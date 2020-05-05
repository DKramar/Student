package exercises.lessonsAutomationTasks.lecture6.task2.den;
/*
Реализовать иерархию двухмерных фигур (круг и квадрат), каждая их которых должна поддерживать следующие операции:
- получить значение площади
- получить координаты центра вписанной окружности
- переопределять методы equals(), clone(), toString()
 */

public class Demo {
    public static void main(String[] args) {
        Figures circle1 = new Circle(new Point(6.0, 4.0), new Point(3.0, 2.0));
        Figures circle2 = new Circle(new Point(6.0, 4.0), new Point(3.0, 2.0));
        System.out.printf("%s%n", circle1);
        System.out.printf("The area of the circle_1 = %.2f%n", circle1.area());
        System.out.printf("circle_1 coordinate center: %s%n", circle1.centerCoordinate());
        System.out.printf("circle_1 and circle_2 are equals: %s%n", circle1.equals(circle2));

        Figures square1 = new Square(new Point(2.0, 4.0), new Point(6.0, 8.0));
        Figures square2 = new Square(new Point(4.0, 2.0), new Point(8.0, 6.0));
        System.out.printf("%n%s%n", square1);
        System.out.printf("The area of the square_1 = %.2f%n", square1.area());
        System.out.printf("square_1 coordinate center: %s%n", square1.centerCoordinate());
        System.out.printf("square_1 and square_2 are equals: %s%n", square1.equals(square2));
    }
}
