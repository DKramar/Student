package javarush.syntax.level3;
/*
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя.
•	Выведенный текст должен содержать введенное число1.
•	Выведенный текст должен содержать введенное число2.
•	Выведенный тест должен полностью соответствовать заданию.
 */

import java.io.*;

public class PredictionForTheFuture {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        System.out.println(name + " получает " + num1 + " через " + num2 + " лет.");
    }
}
