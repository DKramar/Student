package exercises.lessonsAutomationTasks.lecture6.task1.packageMethodOverrides;
/*
  Во всех классах задания lecture5 переопределить методы equals(), clone(), toString() и продемонстрировать их использование.
*/

public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException{
        Package basicPackage = new Package("Ivan", "Poltava", "Kharkov", 10);
        TwoDayPackage twoDayPackage = new TwoDayPackage("Helen", "address", "address", 300, 20);
        OverNightPackage overNightPackage = new OverNightPackage("Vasia", "address", "address", 400, 2);

        double[] Package = new double[]{basicPackage.basicPackageCost(), twoDayPackage.basicPackageCost(), overNightPackage.basicPackageCost()};
        String[] toString = new String[]{basicPackage.toString(), twoDayPackage.toString(), overNightPackage.toString()};

        System.out.println("Lecture 5");
        for (int i = 0; i < Package.length; i++) {
            System.out.println(toString[i] + " DELIVERY WILL COST: " + Package[i] + " $");
        }

        // переопределить метод equals()
        Package basicPackage1 = new Package("Ivan", "Poltava", "Kharkov", 10);
        TwoDayPackage twoDayPackage1 = new TwoDayPackage("Helen", "address", "address", 300, 21);
        OverNightPackage overNightPackage1 = new OverNightPackage("Vasia", "address", "address", 400, 22);

        System.out.printf("%nLecture 6 %nРезультат переопределения метода equals(): %s%n", equalsMethodResult(basicPackage, basicPackage1)); // вывод результата переопределения метода equals() и toString()
        System.out.printf("Результат переопределения метода equals(): %s%n", equalsMethodResult(twoDayPackage, twoDayPackage1)); // вывод результата переопределения метода equals() и toString()
        System.out.printf("Pезультат переопределения метода equals(): %s%n", equalsMethodResult(overNightPackage, overNightPackage1)); // вывод результата переопределения метода equals() и toString()

        // переопределить метод equals()
        Package cloneBasicPackage = (Package) basicPackage.clone();
        Package clonetwoDayPackage = (Package) twoDayPackage.clone();
        Package cloneoverNightPackage = (Package) overNightPackage.clone();

        System.out.printf("%nРезультат переопределения метода clone():%n%s = %n%s, %n%s = %n%s, %n%s = %n%s%n",
                basicPackage, cloneBasicPackage,
                twoDayPackage, clonetwoDayPackage,
                overNightPackage, cloneoverNightPackage); // вывод результата переопределения метода clone() и toString()
    }

    public static String equalsMethodResult(Package package1, Package package2) {
        String positiveResult = "Packages are EQUAL";
        String negativeResult = "Packages are NOT EQUAL";
        if (package1.equals(package2)) {
            return positiveResult;
        } else {
            return negativeResult;
        }
    }
}
