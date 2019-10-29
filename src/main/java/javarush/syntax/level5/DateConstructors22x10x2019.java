package javarush.syntax.level5;
/*
Вывести на экран текущую дату в аналогичном виде "21 02 2014".

Требования:
•	Дата должна содержать день, месяц и год, разделенные пробелом.
•	День должен соответствовать текущему.
•	Месяц должен соответствовать текущему.
•	Год должен соответствовать текущему.
•	Вся дата должна быть выведена в одной строке.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateConstructors22x10x2019 {
    public static void main(String[] args){

        GregorianCalendar calendar = new GregorianCalendar(); //создаем объект календаря
        System.out.print(calendar.get(Calendar.DAY_OF_MONTH) + " " + (calendar.get(Calendar.MONTH)+1) + " " + calendar.get(Calendar.YEAR));
    }
}
