package javarush.syntax.level8;
/*
Вычисление разницы между двумя датами
 */

import java.util.Date;

public class DateDifferenceBetweenDate {
    public static void main(String[] args) throws Exception {
        Date currentTime = new Date(); // получаем текущую дату
        Thread.sleep(3000); // ждем 3 секунды
        Date newTime = new Date(); // получаем разницу

        long msDelay = newTime.getTime() - currentTime.getTime(); // вычисляем разницу
        System.out.println("Current time is: " + currentTime); // выводим на печать
        System.out.println("New time is: " + newTime);
        System.out.println("Time distance is: " + msDelay + " in ms");
    }
}
