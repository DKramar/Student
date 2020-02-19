package exercises.exceptionsTasks;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        try {
            System.out.println("Введите целое число от 0 до 100");
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if (x >= 30) {
                throw new Exception("Число х должно быть меньше 30");
            }
            else {
                System.out.println("Введенное число = " + x);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");
    }
}
