package javarush.syntax.level4;
/*
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".

Требования:
•	Программа должна дважды считать данные c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если возраст меньше 18 вывести только сообщение "Подрасти еще".
•	Если возраст больше либо равно 18 ничего не выводить.
 */
import java.io.*;

public class EighteenPlus {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВЕДИТЕ ВАШЕ ИМЯ");
        String name = reader.readLine();
        System.out.println("ВВЕДИТЕ ВАШ ВОЗРАСТ");
        String age = reader.readLine();
        int age1 = Integer.parseInt(age);

        if(age1<=18){
            System.out.println(name + " - ПОДРАСТИ ЕЩЕ");
        }
        else{
            System.out.println(" :)) ");
        }
    }
}
