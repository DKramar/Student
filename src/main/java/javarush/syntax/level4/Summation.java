package javarush.syntax.level4;
/*
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
•	Программа должна посчитать сумму введенных чисел и вывести её на экран.
•	В программе должен использоваться цикл for, while или do-while.
 */



import java.util.Scanner;



public class Summation {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("FOR GET A SUM INPUT NUMBERS. FOR EXIT, PUSH -1:");
        int sum = 0;
        int exit = -1;

        while(true){
            int n1 = scanner.nextInt();
            sum = sum+n1;
            if(n1==exit) {
                break;
            }
        }
        System.out.println(sum);
    }
}
