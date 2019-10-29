package javarush.syntax.level5;

public class Rectangle {

    double height;
    double weight;

    public double perimeter(double height, double weight) {
        return 2 * (height + weight);
    }

    public double square(double height, double weight) {
        return height * weight;
    }
}
