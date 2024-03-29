package javarush.syntax.level7;
/*
Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует
строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
Программа выводит содержимое нового списка на экран.

Пример ввода:
Кот
Коты
Я

Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна вывести столько же строк, сколько было введено.
•	Если в строке было четное число букв, то необходимо удвоить строку (как в примере).
•	Если в строке было нечетное число букв, то необходимо утроить строку (как в примере).
•	Программа должна прекращать считывать данные с клавиатуры как только пользователь введет пустую строку и нажмет Enter.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList2WeChangeFunctionality {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine(); // Программа должна считывать данные с клавиатуры.
            if (string == null || string.isEmpty())
                break; // Программа должна прекращать считывать данные с клавиатуры как только пользователь введет пустую строку и нажмет Enter.
            strings.add(string);
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() % 2 == 0) { // Если в строке было четное число букв, то необходимо удвоить строку
                strings.add(i + 1, strings.get(i) + " " + strings.get(i));
                strings.remove(strings.get(i));
            } else { //Если в строке было нечетное число букв, то необходимо утроить строку
                strings.add(i + 1, strings.get(i) + " " + strings.get(i) + " " + strings.get(i));
                strings.remove(strings.get(i));
            }
        }

        for (int j = 0; j < strings.size(); j++) {
            System.out.println(strings.get(j));
        }
    }
}

