package exercises.fraction;

public class Rational {
    private int n; // параметр числителя
    private int d; // параметр знаменателя

    /*public Rational(int n) {
        setValue(n);
    }*/

    public Rational(int n, int d) {
        setValue(n, d);
    }

    public Rational(Rational f) {
        setValue(f);
    }

    /*public int getNumerator() { // получить значение числителя
        return n;
    }

    public int getDenominator() { // получить значение знаменателя
        return d;
    }

    public void setNumerator(int n) { // задать значение с различными параметрами числителя
        setValue(n, this.d);
    }

    public void setDenominator(int d) { // задать значение с различными параметрами знаменателя
        setValue(this.n, d);
    }*/

   /* public void setValue(int n) { //Assigns a new fraction from an integer number. Задать значение с различными параметрами целым числом
        this.n = n;
        this.d = 1;
    }*/

    public void setValue(int n, int d) { // Assigns a new value to the fraction. Задать значение с различными параметрами числителя и знаменателя
        this.n = n;
        this.d = d;
    }

    public void setValue(Rational f) { // задать значение с различными параметрами другой дроби
        this.n = f.n;
        this.d = f.d;
    }

    public void summa(int n, int d) {
        this.n = this.n * d + n * this.d;
        this.d *= d;
    }

    public void substract(int n, int d) {
        summa(n * -1, d);
    }

    public void multiply(int n, int d) {
        this.n *= n;
        this.d *= d;
    }

    private void divide(int n, int d) {
        this.n *= d;
        this.d *= n;
    }

   /* public void summa(int n) { // Adds an integer number to the fraction // для одного числа
        summa(n, 1);
    }*/

    public void summa(Rational f) { // Adds another fraction to the fraction
        summa(f.n, f.d);
    }

    public void divide(Rational f){
        divide(f.n, f.d);
    }
}
