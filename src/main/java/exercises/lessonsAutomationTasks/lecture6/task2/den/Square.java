package exercises.lessonsAutomationTasks.lecture6.task2.den;

import java.util.Objects;

public class Square extends Figures {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double area() {
        return sideLength * sideLength;
    }

    public double centerCoordinate() {
        return sideLength / 2;
    }

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
