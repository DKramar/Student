package exercises.lessonsAutomationTasks.lecture6.task2.den;

public class CenterCoordinates {
    private double x;
    private double y;

    public CenterCoordinates() {
        this.x = 0;
        this.y = 0;
    }

   /* public CenterCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }*/

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + ", " + "y = " + y;
    }
}
