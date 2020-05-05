package exercises.lessonsAutomationTasks.lecture6.task2.den;

import java.util.Objects;

public class Circle extends Figures {
    private Point axisOffsetXYPoint1;
    private Point axisOffsetXYPoint2;

    public Circle(Point axisOffsetXYPoint1, Point axisOffsetXYPoint2) {
        this.axisOffsetXYPoint1 = axisOffsetXYPoint1;
        this.axisOffsetXYPoint2 = axisOffsetXYPoint2;
    }

    public double radius() {
        double diameter = Math.sqrt(Math.pow(axisOffsetXYPoint2.getX() - axisOffsetXYPoint1.getX(), 2)
                + Math.pow(axisOffsetXYPoint2.getY() - axisOffsetXYPoint1.getY(), 2));
        return diameter / 2;
    }

    public double area() {
        return Math.PI * Math.pow(radius(), 2);
    }

    @Override
    public Point centerCoordinate() {
        Point result = new Point();
        result.setX((axisOffsetXYPoint1.getX() + axisOffsetXYPoint2.getX()) / 2);
        result.setY((axisOffsetXYPoint1.getY() + axisOffsetXYPoint2.getY()) / 2);
        return result;
    }

    @Override
    public String toString() {
        return "Circle radius = " + radius();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return axisOffsetXYPoint1.equals(circle.axisOffsetXYPoint1) &&
                axisOffsetXYPoint2.equals(circle.axisOffsetXYPoint2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(axisOffsetXYPoint1, axisOffsetXYPoint2);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
