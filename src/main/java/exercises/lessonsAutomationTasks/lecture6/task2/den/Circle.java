package exercises.lessonsAutomationTasks.lecture6.task2.den;

import static java.lang.Math.PI;

public class Circle extends Figures {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 2 * PI * radius;
    }

    public double centerCoordinate() {
        return radius;
    }
}
