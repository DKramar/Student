package javarush.syntax.level8;
/*
Наступило ли уже некоторое время
 */

import java.util.Date;

public class DateHasItComeSomeTime {
    public static void main(String[] args) throws Exception {
        Date startTime = new Date(); // создаем объект начала времени
        long endTime = startTime.getTime() + 5000; // + 5000 сек
        Date endDate = new Date(endTime);

        Thread.sleep(6000); //ждем 6 сек
        Date currentTime = new Date();
        if (currentTime.after(endDate)) { // проверяем, что currentTime после endDate
            System.out.println("End time!");
        }
    }
}
