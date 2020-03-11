package exercises.lessonsAutomationTasks.lecture6.task1.rationalMethodOverrides;

import java.util.Objects;

public class Rational implements Cloneable{
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

    @Override
    public String toString() { //переопределить метод equals()
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

    @Override //переопределить метод equals()
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return numerator == rational.numerator &&
                denominator == rational.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override //переопределить метод clone()
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
