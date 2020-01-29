package exercises.lessonsAutomationTasks.lecture5.task1;

public class Rational {

    private static int numerator;
    private static int denominator;
  /*  public static int c;
    public static int d;*/

    public Rational(int a, int b) {
        this.numerator = a;
        this.denominator = b;
    }

    /*int getNumerator() {
        return numerator;
    }

    int getDenominator() {
        return denominator;
    }*/

    public static int summaNumerator(/*Rational fraction1, Rational fraction2*/){
        return fraction1.numerator * fraction2.denominator + fraction1.denominator * fraction2.numerator;
    }

    /*public int summaNumerator(Rational fraction1, Rational fraction2) {
        int result;
        if (fraction1.denominator == 0 || fraction2.denominator == 0) {
            result = 0;
        } else {
            result = fraction1.numerator * fraction2.denominator + fraction1.denominator * fraction2.numerator;
        }
        return result;
    }*/

    private static int summaDenominator() {
        int result;
        if (denominator == 0 /*|| d == 0*/) {
            result = 0;
        } else {
            result = denominator * denominator;
        }
        return result;
    }

    private static int subtractionNumerator(int a, int b, int c, int d) {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = a * d - b * c;
        }
        return result;
    }

    private static int subtractionDenominator(int b, int d) {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = b * d;
        }
        return result;
    }

    private static int multiplicationNumerator(int a, int b, int c, int d) {
        int result;
        if (b == 0 || d == 0 || a == 0 || c == 0) {
            result = 0;
        } else {
            result = a * c;
        }
        return result;
    }

    private static int multiplicationDenominator(int b, int d) {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = b * d;
        }
        return result;
    }

    private static int divisionNumerator(int a, int b, int d) {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = a * d;
        }
        return result;
    }

    private static int divisionDenominator(int b, int d, int c) {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = b * c;
        }
        return result;
    }
    public static String summaResult() {
        return summaNumerator() + "/" + summaDenominator();
        }

    /*public static String summaResult(int a, int b, int c, int d) {
        String r;
        if (b == 0 || d == 0) {
            r = a + "/" + b + " + " + c + "/" + d + " = " + "Division by zero";
        } else {
            r = a + "/" + b + " + " + c + "/" + d + " = " + summaNumerator() + "/" + summaDenominator();
        }
        return r;
    }*/

    public static String substractionResult(int a, int b, int c, int d) {
        String r;
        if (b == 0 || d == 0) {
            r = a + "/" + b + " - " + c + "/" + d + " = " + "Division by zero";
        } else {
            r = a + "/" + b + " - " + c + "/" + d + " = " + subtractionNumerator(a, b, c, d) + "/" + subtractionDenominator(b, d);
        }
        return r;
    }

    public static String multiplicationResult(int a, int b, int c, int d) {
        String r;
        if (b == 0 || d == 0) {
            r = a + "/" + b + " * " + c + "/" + d + " = " + "Division by zero";
        } else if (a == 0 || c == 0) {
            r = a + "/" + b + " * " + c + "/" + d + " = " + "0";
        } else {
            r = a + "/" + b + " * " + c + "/" + d + " = " + multiplicationNumerator(a, b, c, d) + "/" + multiplicationDenominator(b, d);
        }
        return r;
    }

    public static String divisionResult(int a, int b, int c, int d) {
        String r;
        if (b == 0 || d == 0) {
            r = a + "/" + b + " / " + c + "/" + d + " = " + "Division by zero";
        } else if (a == 0 || c == 0) {
            r = a + "/" + b + " / " + c + "/" + d + " = " + "0";
        } else {
            r = a + "/" + b + " / " + c + "/" + d + " = " + divisionNumerator(a, b, d) + "/" + divisionDenominator(b, d, c);
        }
        return r;
    }
}
