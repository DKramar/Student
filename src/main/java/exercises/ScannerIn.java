package exercises;

//добавил интрукцию
import java.util.Scanner; // класс сканер объявлен в пакете java.utils

public class ScannerIn {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x = 0;
        x = in.nextInt(); // вводим число
        System.out.println("Вы ввели " + x); // выводим результат
    }
}
