package javarush.syntax.level4;
/*
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

Требования:
•	Программа должна считывать число c клавиатуры.
•	Программа должна выводить текст на экран.
•	Если введено число от 1 до 7, необходимо вывести день недели.
•	Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
 */

import java.io.*;

public class DayOfTheWeek {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВЕДИТЕ НОМЕР ДНЯ НЕДЕЛИ:");
        String numberOfTheWeek = reader.readLine();
        int numberOfTheWeekInt = Integer.parseInt(numberOfTheWeek);
        if(numberOfTheWeekInt==1){
            System.out.println("понедельник");
        }
        else if(numberOfTheWeekInt==2){
            System.out.println("вторник");
        }
        else if(numberOfTheWeekInt==3){
            System.out.println("среда");
        }
        else if(numberOfTheWeekInt==4){
            System.out.println("четверг");
        }
        else if(numberOfTheWeekInt==5){
            System.out.println("пятница");
        }
        else if(numberOfTheWeekInt==6){
            System.out.println("суббота");
        }
        else if(numberOfTheWeekInt==7){
            System.out.println("воскресенье");
        }
        else{
            System.out.println("такого дня недели не существует");
        }
    }
}
