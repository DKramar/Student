package exercises.fraction;

public class Demo {
    public static void main(String[] args) {

        Rational fraction1 = new Rational(2, 3);
        Rational fraction2 = new Rational(5, 2);

        System.out.println(fraction1 + " + " + fraction2 + " = " + fraction1.add(fraction2));
        System.out.println(fraction1 + " - " + fraction2 + " = " + fraction1.subtraction(fraction2));
        System.out.println(fraction1 + " * " + fraction2 + " = " + fraction1.multiplication(fraction2));
        System.out.println(fraction1 + " / " + fraction2 + " = " + fraction1.division(fraction2));
    }
}
