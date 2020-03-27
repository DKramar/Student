package exercises.polymorphismExample.points;

public class XYPoints {
    private int x;
    private int y;

    public XYPoints(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + "; " + "y = " + y + ";";
    }
}
