package javarush.syntax.level3;

public class Scanner {
    public static void main(String[] args){

            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("Введите число:");

            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                System.out.println("Спасибо! Вы ввели число " + number);
            } else {
                System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            }
    }
}
