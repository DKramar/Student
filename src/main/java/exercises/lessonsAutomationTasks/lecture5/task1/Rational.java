package exercises.lessonsAutomationTasks.lecture5.task1;

public class Rational {

    private static int a;
    private static int b;
    private static int c;
    private static int d;

    public static void setA(int a) {
        Rational.a = a;
    }

    public static void setB(int b) {
        Rational.b = b;
    }

    public static void setC(int c) {
        Rational.c = c;
    }

    public static void setD(int d) {
        Rational.d = d;
    }

    public static int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

    public static int getC() {
        return c;
    }

    public static int getD() {
        return d;
    }

    public static int summaNumerator() {
        /*int result;
        if (b == 0 || d == 0) {

        } else {
            result = a * d + b * c;
        }
        return result;*/
        return a * d + b * c;
    }

    public static int summaDenominator() {
        /*int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = b * d;
        }
        return result;*/
        return b * d;
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
        String r;
        if (b == 0 || d == 0) {
            r = a + "/" + b + " + " + c + "/" + d + " = " + "Division by zero";
        } else {
            r = a + "/" + b + " + " + c + "/" + d + " = " + summaNumerator() + "/" + summaDenominator();
        }
        return r;
    }

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
