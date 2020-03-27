package exercises.polymorphismExample.car;

public class Demo {
    void useCar(Car car) {
        car.getCarName();
        System.out.println("Quantity of sits - " + car.getCarSits());
    }

    public static void main(String[] args) {
        Demo main = new Demo();
        main.useCar(new Car());
        Car car = new ToyotaCar();
        main.useCar(car);
    }
}
