package exercises.polymorphismExample.points;

public class Demo {
    public static void main(String[] args) {
        XYPoints xy = new XYPoints(1, 2);
        XYPoints xyz = new XYZPoints(3,4,5);
        XYPoints xyztime = new XYZTime(6,7,8,98);

        System.out.println(xy.toString());
        System.out.println(xyz.toString());
        System.out.println(xyztime.toString());
    }
}
