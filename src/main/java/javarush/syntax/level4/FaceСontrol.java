package javarush.syntax.level4;
/*
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".

Требования:
•	Программа должна считывать строки c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если возраст больше 20 вывести только сообщение "И 18-ти достаточно".
•	Если возраст меньше либо равно 20 ничего не выводить.
 */

import java.io.*;

public class FaceСontrol {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВЕДИТЕ ИМЯ");
        String name = reader.readLine();
        System.out.println("ВВЕДИТЕ ВОЗРАСТ");
        String age = reader.readLine();
        int age1 = Integer.parseInt(age);

        if(age1>20){
            System.out.println(name + " И 18-ти достаточно");
        }
        else{
            System.out.println(" :( ");
        }
    }
}
