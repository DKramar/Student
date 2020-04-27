package exercises.lessonsAutomationTasks.lecture6.task2.den;

import java.util.Objects;

public class Square extends Figures {
    private double sideLength;
    private double axisOffsetX;
    private double axisOffsetY;

    public Square(double sideLength, double axisOffsetX, double axisOffsetY) {
        this.sideLength = sideLength;
        this.axisOffsetX = axisOffsetX;
        this.axisOffsetY = axisOffsetY;
    }

    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public CenterCoordinates centerCoordinate() {
        CenterCoordinates result = new CenterCoordinates();
        result.setX(this.axisOffsetX + (sideLength / 2));
        result.setY(this.axisOffsetY + (sideLength / 2));
        return result;
    }

    /*@Override
    public CenterCoordinates centerCoordinate() {
        return new CenterCoordinates(axisOffsetX+(sideLength/2),axisOffsetY+(sideLength/2));
    }*/

    @Override
    public String toString() {
        return "Square sideLength = " + sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.sideLength, sideLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideLength);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
