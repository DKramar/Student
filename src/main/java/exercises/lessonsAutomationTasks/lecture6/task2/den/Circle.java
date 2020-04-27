package exercises.lessonsAutomationTasks.lecture6.task2.den;

import java.util.Objects;

import static java.lang.Math.PI;

public class Circle extends Figures {
    private double radius;
    private double axisOffsetX;
    private double axisOffsetY;

    public Circle(double radius, double axisOffsetX, double axisOffsetY) {
        this.radius = radius;
        this.axisOffsetX = axisOffsetX;
        this.axisOffsetY = axisOffsetY;
    }

    public double area() {
        return PI * radius * radius;
    }

    @Override
    public CenterCoordinates centerCoordinate() {
        CenterCoordinates result = new CenterCoordinates();
        result.setX(this.axisOffsetX);
        result.setY(this.axisOffsetY);
        return result;
    }

    /*@Override
    public CenterCoordinates centerCoordinate() {
        return new CenterCoordinates(axisOffsetX, axisOffsetY);
    }*/

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
