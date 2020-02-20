package exercises.lessonsAutomationTasks.lecture5.task1;

public class Rational {
    private int numerator; // параметр числителя
    private int denominator; // параметр знаменателя

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int nominator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("DENOMINATOR MUSTN'T BE NULL");
        }
        this.numerator = nominator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Rational add(Rational rational) {
        Rational result = new Rational();
        result.setNumerator(this.numerator * rational.getDenominator() + this.denominator * rational.getNumerator());
        result.setDenominator(this.denominator * rational.getDenominator());
        return result;
    }

    public Rational subtraction(Rational rational) {
        Rational result = new Rational();
        result.setNumerator(this.numerator * rational.getDenominator() - this.denominator * rational.getNumerator());
        result.setDenominator(this.denominator * rational.getDenominator());
        return result;
    }

    public Rational multiplication(Rational rational) {
        Rational result = new Rational();
        result.setNumerator(this.numerator * rational.getNumerator());
        result.setDenominator(this.denominator * rational.getDenominator());
        return result;
    }

    public Rational division(Rational rational) {
        Rational result = new Rational();
        result.setNumerator(this.numerator * rational.getDenominator());
        result.setDenominator(this.denominator * rational.getNumerator());
        return result;
    }

    /*@Override
    public String toString() {
        return numerator + "/" + denominator;
    }*/

    @Override
    public String toString() {
        if (numerator == denominator) {
            return String.valueOf(numerator);
        }
        return numerator / gcd(numerator, denominator) + "/" + denominator / gcd(numerator, denominator);
    }

    private int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        } else {
            return gcd(n2, n1 % n2);
        }
    }
}
