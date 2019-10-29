package javarush.syntax.level4;

public class Car {

    String model;
    int speed;

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Ferrari";
        car1.speed = 300;

        Car car2 = new Car();
        car2.model = "Ferrari";
        car2.speed = 300;
        System.out.println(car1 == car2);
    }
}
