package exercises.lessonsAutomationTasks.lecture6.task1.rationalMethodOverrides;
/*
Во всех классах задания lecture5 переопределить методы equals(), clone(), toString() и продемонстрировать их использование.
 */

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {

        Rational fraction1 = new Rational(2, 2);
        Rational fraction2 = new Rational(2, 2);

        System.out.println("Lecture 5");
        System.out.println(fraction1 + " + " + fraction2 + " = " + fraction1.add(fraction2));
        System.out.println(fraction1 + " - " + fraction2 + " = " + fraction1.subtraction(fraction2));
        System.out.println(fraction1 + " * " + fraction2 + " = " + fraction1.multiplication(fraction2));
        System.out.println(fraction1 + " / " + fraction2 + " = " + fraction1.division(fraction2));

        // переопределить метод equals()
        System.out.println("Lecture 6");
        System.out.println("Результат переопределения метода equals():");
        if (fraction1.equals(fraction2)) {
            System.out.println("Fraction1 = Fraction2");
        } else {
            System.out.println("Fractions are NOT equal");
        }
        System.out.println();

        //переопределить метод clone()
        Rational cloneFraction1 = (Rational) fraction1.clone();
        Rational cloneFraction2 = (Rational) fraction2.clone();
        System.out.println("Результат переопределения метода clone():");
        System.out.println("Fraction 1 = "+ fraction1 + ", Fraction 2 = " + fraction2);
        System.out.println("Clone fraction 1 = " + cloneFraction1 + ", Clone Fraction 2 = " + cloneFraction2);
        System.out.println();

        //переопределить методы toString()
    }
}
