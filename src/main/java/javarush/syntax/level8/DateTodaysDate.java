package javarush.syntax.level8;
/*
Получение текущей даты
Чтобы узнать текущее время – достаточно просто создать объект.
 */

import java.util.Date;

public class DateTodaysDate {
    public static void main(String[] args)throws Exception{

        Date today = new Date();
        System.out.println(today);
    }
}
