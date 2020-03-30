package exercises.lessonsAutomationTasks.lecture6.task2.den;

import static java.lang.Math.PI;

public class Square extends Figures {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double area() {
        return sideLength*sideLength;
    }

    public double centerCoordinate() {
        return sideLength/2;
    }
}
