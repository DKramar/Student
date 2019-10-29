package javarush.syntax.level3;
/*
Вывести на экран произведение 10 чисел от 1 до 10.
Результат - это 1 число.

Подсказка:
будет три миллиона с хвостиком.

Требования:
•	Программа должна выводить целое число на экран.
•	Метод main должен вызывать функцию System.out.println.
•	Выведенное число должно быть больше трех миллионов.
•	Выведенное число должно соответствовать заданию.
 */

public class MultiplicationTenNumbers {
    public static void main(String[] args) {
        int mult = 1;
        for(int first = 1; first<=10; first++) {
            mult = mult * first;
        }
         System.out.println(mult);
    }
}
