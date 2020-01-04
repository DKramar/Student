package exercises.lessonsAutomationTasks;

public class lessonThree {
    public static void main(String[] args) {
        /*
        TASK 1
        В переменных q и w хранятся два натуральных числа.
        Создайте программу, выводящую на экран результат деления q на w с остатком.
        Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке
         */
        int q = 21;
        int w = 8;
        int intN = q / w;
        double balance = ((double) q / w) - q / w;
        System.out.print("TASK 1) " + q + " / " + w + " = " + intN + " и ");
        System.out.printf("%.1f", balance);
        System.out.println(" в остатке");

        /*
        TASK 2
        В переменной n хранится натуральное двузначное число.
        Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
         */
        int n = 98;
        int x = n % 10;
        int y = (n / 10) % 10;
        int z = x + y;
        System.out.println("TASK 2) " + "Сумма цифр числа " + n + " равна: " + y + " + " + x + " = " + z);

        /*
        TASK 3
        В переменной n хранится вещественное число с ненулевой дробной частью.
        Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
         */
        double num = 56.56;
        System.out.println("TASK 3) " + "Число " + num + " округленное до ближайшего целого равно: " + (int) num);

        /*
        TASK 4
        Даны три переменные a, b и c. Изменить значения этих переменных так, чтобы в a хранилось значение a+b,
        в b хранилась разность старых значений c−a, а в c хранилось сумма старых значений a+b+c.
        Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7.
         */

        class Change {
            int a;
            int b;
            int c;

            Change(int a, int b, int c) {
                this.a = a + b;
                this.b = c - a;
                this.c = a + b + c;
            }
        }
        int a = 0;
        int b = 2;
        int c = 5;
        System.out.print("TASK 4) " + "Old data: " + "a = " + a + "; b = " + b + "; c = " + c);
        Change change = new Change(a, b, c);
        a = change.a;
        b = change.b;
        c = change.c;
        System.out.println("  New data: " + "a = " + a + "; b = " + b + "; c = " + c);
    }
}
