package javarush.syntax.level4;
/*
Напишите метод checkSeason. По номеру месяца, метод должен определить время года
(зима, весна, лето, осень) и вывести на экран.

Пример для номера месяца 2:
зима

Пример для номера месяца 5:
весна

Требования:
•	Программа должна выводить текст на экран.
•	Метод main не должен вызывать функцию System.out.println или System.out.print.
•	Метод main должен вызывать метод checkSeason.
•	Метод checkSeason должен быть static void, и иметь только один параметр int.
•	Метод checkSeason должен выводить текст на экран согласно заданию.
 */

public class SeasonsOnTerra {
    public static void main(String[] args){
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month){

        if(3<=month && month<=5){
            System.out.println("SPRING");
        }
        else if(6<=month && month<=8){
            System.out.println("SUMMER");
        }
        else if(9<=month && month<=11) {
            System.out.println("AUTUMN");
        }
        else{
            System.out.println("WINTER");
        }

    }
}


