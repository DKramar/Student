package javarush.syntax.level7;
/*
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
•	Саму строку "end" не нужно добавлять в список.
•	Выведи список на экран, каждое значение с новой строки.
•	Используй цикл for.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList2ItIsTheEnd {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(); // Объяви переменную типа список строк и сразу проинициализируй ee.

        while (true) { // Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
            String s = reader.readLine();
            if (s.equals("end")) break;
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) { // выводим данные массива на печать
            System.out.println(list.get(i));
        }
    }
}