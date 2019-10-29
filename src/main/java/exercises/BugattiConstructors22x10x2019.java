package exercises;

public class BugattiConstructors22x10x2019 {

    String model;
    int maxSpeed;

    public BugattiConstructors22x10x2019(String model, int maxSpeed){
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public static void main (String[] args){
        BugattiConstructors22x10x2019 bugatti = new BugattiConstructors22x10x2019("Bugatti Veyron", 400);

        System.out.println(bugatti.model);
        System.out.println(bugatti.maxSpeed);
    }
}
