package javarush.syntax.level8;
/*
Сколько прошло времени с начала сегодняшнего дня:
 */

import java.util.Date;

public class HowMuchTimeHasPassed {
    public static void main(String[] args) throws Exception {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int sec = currentTime.getSeconds();

        System.out.println("Time from midnight: " + hours + " : " + mins + " : " + sec);
    }
}
