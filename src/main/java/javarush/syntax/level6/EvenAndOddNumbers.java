package javarush.syntax.level6;
/*
Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.

Пример для числа 4445:
Even: 3 Odd: 1

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Метод main должен посчитать сколько четных цифр во веденном числе и записать это количество в переменную even.
•	Метод main должен посчитать сколько нечетных цифр во веденном числе и записать это количество в переменную odd.
•	Программа должна выводить текст на экран.
•	Выведенный текст должен соответствовать заданию.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenAndOddNumbers {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER NUMBER:");
        String n = reader.readLine();

        for (int i = 0; i < n.length(); i++) {
            if ((n.charAt(i) - '0') % 2 == 0) { //charAt() возвращает символ из массива строки по указанному индексу.
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
