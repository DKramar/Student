package exercises.polymorphismExample.points;

public class XYZPoints extends XYPoints {
    private int z;

    public XYZPoints(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + " z = " + z + ";";
    }
}
