package exercises.fraction;

public class Demo {
    public static void main(String[] args) {
        Rational number1 = new Rational(2,0);
       /* number1.setNominator(2);
        number1.setDenominator(5);*/

        Rational number2 = new Rational(1,5);


        System.out.println(number1.add(number2).add(number1));





        /*try {
        int n1 = (int) (Math.random() * (11 + 10) - 10);
        int d1 = (int) (Math.random() * (11 + 10) - 10);
        int n2 = (int) (Math.random() * (11 + 10) - 10);
        int d2 = (int) (Math.random() * (11 + 10) - 10);

        Rational f1 = new Rational(n1, d1);
        String f1Str = f1.toString();
        System.out.println("The first fraction is " + f1Str);

        Rational f2 = new Rational(n2, d2);
        String f2Str = f2.toString();
        System.out.println("The second fraction is " + f2Str);


        Rational temp = new Rational(f1);
        temp.add(f2);
        System.out.println(*//*f1Str + " + " + f2Str + " = " + *//*temp.toString());
        temp.setValue(f1);

*//*
        temp.substract(f2);
        System.out.println(f1Str + " - " + f2Str + " = " + temp.toString());
        temp.setValue(f1);

        temp.multiply(f2);
        System.out.println(f1Str + " * " + f2Str + " = " + temp.toString());
        temp.setValue(f1);

        temp.divide(f2);
        System.out.println(f1Str + " / " + f2Str + " = " + temp.toString());
        temp.setValue(f1);
*//*
    }*/
    }
}
