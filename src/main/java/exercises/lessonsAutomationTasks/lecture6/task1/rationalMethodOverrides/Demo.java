package exercises.lessonsAutomationTasks.lecture6.task1.rationalMethodOverrides;
/*
Во всех классах задания lecture5 переопределить методы equals(), clone(), toString() и продемонстрировать их использование.
 */

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {

        Rational fraction1 = new Rational(3, 2);
        Rational fraction2 = new Rational(5, 2);

        System.out.println("Lecture 5");
        System.out.println(fraction1 + " + " + fraction2 + " = " + fraction1.add(fraction2));
        System.out.println(fraction1 + " - " + fraction2 + " = " + fraction1.subtraction(fraction2));
        System.out.println(fraction1 + " * " + fraction2 + " = " + fraction1.multiplication(fraction2));
        System.out.println(fraction1 + " / " + fraction2 + " = " + fraction1.division(fraction2));

        Rational cloneFraction1 = (Rational) fraction1.clone(); //переопределить метод clone()
        Rational cloneFraction2 = (Rational) fraction2.clone();

        System.out.printf("%nLecture 6 %nРезультат переопределения метода equals(): %s%n", equalsMethodResult(fraction1, fraction2)); // вывод результата переопределения метода equals() и toString()
        System.out.printf("Результат переопределения метода clone(): %s = %s, %s = %s%n", fraction1, cloneFraction1, fraction2, cloneFraction2); // вывод результата переопределения метода clone() и toString()
    }

    public static String equalsMethodResult(Rational fraction1, Rational fraction2) {
        String positiveResult = "BasicPackage1 = BasicPackage2";
        String negativeResult = "BasicPackage1 is NOT equal BasicPackage2";
        if (fraction1.equals(fraction2)) {
            return positiveResult;
        } else {
            return negativeResult;
        }
    }
}
