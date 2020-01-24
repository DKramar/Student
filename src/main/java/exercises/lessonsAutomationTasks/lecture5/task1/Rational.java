package exercises.lessonsAutomationTasks.lecture5.task1;

public class Rational {

    public static int a;
    public static int b;
    public static int c;
    public static int d;

    public Rational(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int summaNumerator() {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = a * d + b * c;
        }
        return result;
    }

    public int summaDenominator() {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = b * d;
        }
        return result;
    }

    public int subtractionNumerator() {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = a * d - b * c;
        }
        return result;
    }

    public int subtractionDenominator() {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = b * d;
        }
        return result;
    }

    public int multiplicationNumerator() {
        int result;
        if (b == 0 || d == 0 || a == 0 || c == 0) {
            result = 0;
        } else {
            result = a * c;
        }
        return result;
    }

    public int multiplicationDenominator() {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = b * d;
        }
        return result;
    }

    public int divisionNumerator() {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = a * d;
        }
        return result;
    }

    public int divisionDenominator() {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = b * c;
        }
        return result;
    }

    public String summaResult() {
        String r;
        if (b == 0 || d == 0) {
            r = a + "/" + b + " + " + c + "/" + d + " = " + "Division by zero";
        } else {
            r = a + "/" + b + " + " + c + "/" + d + " = " + summaNumerator() + "/" + summaDenominator();
        }
        return r;
    }

    public String substractionResult() {
        String r;
        if (b == 0 || d == 0) {
            r = a + "/" + b + " - " + c + "/" + d + " = " + "Division by zero";
        } else {
            r = a + "/" + b + " - " + c + "/" + d + " = " + subtractionNumerator() + "/" + subtractionDenominator();
        }
        return r;
    }

    public String multiplicationResult() {
        String r;
        if (b == 0 || d == 0) {
            r = a + "/" + b + " * " + c + "/" + d + " = " + "Division by zero";
        } else if (a == 0 || c == 0) {
            r = a + "/" + b + " * " + c + "/" + d + " = " + "0";
        } else {
            r = a + "/" + b + " * " + c + "/" + d + " = " + multiplicationNumerator() + "/" + multiplicationDenominator();
        }
        return r;
    }

    public String divisionResult() {
        String r;
        if (b == 0 || d == 0) {
            r = a + "/" + b + " / " + c + "/" + d + " = " + "Division by zero";
        } else if (a == 0 || c == 0) {
            r = a + "/" + b + " / " + c + "/" + d + " = " + "0";
        } else {
            r = a + "/" + b + " / " + c + "/" + d + " = " + divisionNumerator() + "/" + divisionDenominator();
        }
        return r;
    }
}
