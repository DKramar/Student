package javarush.syntax.level2;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius){
        double tf = (celsius * 9.0/5.0) + 32.0;
        return tf;
    }
}
