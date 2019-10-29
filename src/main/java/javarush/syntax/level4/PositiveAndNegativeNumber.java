package javarush.syntax.level4;
/*
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.

Требования:
•	Программа должна считывать число c клавиатуры.
•	Программа должна выводить число на экран.
•	Если введенное число положительное, необходимо увеличить его в два раза и вывести.
•	Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
•	Если введенное число равно нулю, необходимо вывести ноль.
 */
import java.io.*;

public class PositiveAndNegativeNumber {
    public static void main (String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        String number = reader.readLine();
        int numberInt = Integer.parseInt(number);
        if(numberInt>0){
            System.out.println(numberInt*2);
        }
        else if(numberInt<0){
            System.out.println(numberInt+1);
        }
        else if(numberInt==0){
            System.out.println(0);
        }
    }

}
