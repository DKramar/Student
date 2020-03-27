package exercises.polymorphismExample.points;

public class XYZTime extends XYZPoints {
    private long time;

    public XYZTime(int x, int y, int z, long time) {
        super(x, y, z);
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() + " time = " + time + ";";
    }
}
