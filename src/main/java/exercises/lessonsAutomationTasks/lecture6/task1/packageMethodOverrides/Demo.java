package exercises.lessonsAutomationTasks.lecture6.task1.packageMethodOverrides;

public class Demo {
  /*
Во всех классах задания lecture5 переопределить методы equals(), clone(), toString() и продемонстрировать их использование.
 */

    public static void main(String[] args) {
        Package basicPackage = new Package("Ivan", "address", "address", 200);
        TwoDayPackage twoDayPackage = new TwoDayPackage("Helen", "address", "address", 300, 20);
        OverNightPackage overNightPackage = new OverNightPackage("Vasia", "address", "address", 400, 2);

        double[] Package = new double[]{basicPackage.basicPackageCost(), twoDayPackage.basicPackageCost(), overNightPackage.basicPackageCost()};
        String[] toString = new String[]{basicPackage.toString(), twoDayPackage.toString(), overNightPackage.toString()};

        for (int i = 0; i < Package.length; i++) {
            System.out.println(toString[i] + " DELIVERY WILL COST: " + Package[i] + " $");
        }
    }
}
