package exercises.fraction;

public class Rational {
    private int nominator; // параметр числителя
    private int denominator; // параметр знаменателя

    /*public Rational(int nominator) {
        setValue(nominator);
    }*/

    public Rational() {
    }

    public Rational(int nominator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator must not be NULL");
        }
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public int getNominator() {
        return nominator;
    }

    public void setNominator(int nominator) {
        this.nominator = nominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Rational add(Rational rational) {
        Rational result = new Rational();
        result.setNominator(this.nominator * rational.getDenominator() + this.denominator * rational.getNominator());
        result.setDenominator(this.denominator * rational.getDenominator());
        return result;
    }

    @Override
    public String toString() {
       /* if(nominator==denominator){
            return String.valueOf(nominator);
        }*/
        return nominator / gcd(nominator,denominator) + "/" + denominator/gcd(nominator,denominator);
    }

    private int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        } else {
            return gcd(n2, n1 % n2);
        }
    }

}
