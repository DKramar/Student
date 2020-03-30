package exercises.lessonsAutomationTasks.lecture6.task2.den;
/*
Реализовать иерархию двухмерных фигур (круг и квадрат), каждая их которых должна поддерживать следующие операции:
- получить значение площади
- получить координаты центра вписанной окружности
- переопределять методы equals(), clone(), toString()
 */

public class Demo {
    public static void main(String[] args) {
        Figures circle = new Circle(7.47);
        System.out.printf("The area of the circle = %s", circle.area());

        Figures square = new Square(12.5);


    }
}
