package exercises.lessonsAutomationTasks.lecture6.task2.den;

import java.util.Objects;

import static java.lang.Math.PI;

public class Circle extends Figures {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double centerCoordinate() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle radius = " + radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
