package exercises.polymorphismExample.car;

public class ToyotaCar extends Car {
    @Override
    public int getCarSits() {
        int sits = 8;
        return sits;
    }

    public void getCarName() {
        String name = "TOYOTA";
        System.out.println("Name of the car - " + name);
    }
}
