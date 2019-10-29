package javarush.syntax.level3;
/*
Напиши код, который считает сколько секунд прошло с 15:00, если на часах 15:30. Выведи результат на экран.

Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен быть целым положительным числом.
•	Выведенное число должно быть кратно 60.
•	Выводимое число должно соответствовать заданию.
 */

public class DoNotThinkAboutSeconds {
    public static void main(String[] args) throws Exception{
        double start = 15.00;
        double end = 15.30;
        int secondsAfter15 = 0;
        double result = (end-start)*100*60;
        secondsAfter15 = secondsAfter15+(int)result;
        System.out.println(secondsAfter15);
    }
}
