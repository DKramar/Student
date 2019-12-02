package javarush.syntax.level7;/*

1. Создай список строк.
        2. Считай с клавиатуры 5 строк и добавь в список.
        3. Используя цикл, найди самую короткую строку в списке.
        4. Выведи найденную строку на экран.
        5. Если таких строк несколько, выведи каждую с новой строки.

        Требования:
        •	Объяви переменную типа список строк и сразу проинициализируй ee.
        •	Программа должна считывать 5 строк с клавиатуры и записывать их в список.
        •	Программа должна выводить самую короткую строку на экран.
        •	Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
        */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WeExpressShorter {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listMin = new ArrayList<String>(); // создал список строк
        ArrayList<String> strings = new ArrayList<String>();
        int minLenght;

        for (int i = 0; i < 3; i++) {
            String s = reader.readLine();
            strings.add(i, s); // добавил строки введенные с клавиатуры в список
        }

        //Возможно поможет - https://ru.stackoverflow.com/questions/634119/%d0%9f%d0%be%d0%b8%d1%81%d0%ba-%d0%b8%d0%bd%d0%b4%d0%b5%d0%ba%d1%81%d0%be%d0%b2-%d0%bc%d0%b8%d0%bd%d0%b8%d0%bc%d0%b0%d0%bb%d1%8c%d0%bd%d0%be%d0%b3%d0%be-%d0%b8-%d0%bc%d0%b0%d0%ba%d1%81%d0%b8%d0%bc%d0%b0%d0%bb%d1%8c%d0%bd%d0%be%d0%b3%d0%be-%d1%8d%d0%bb%d0%b5%d0%bc%d0%b5%d0%bd%d1%82%d0%be%d0%b2-%d0%bc%d0%b0%d1%81%d1%81%d0%b8%d0%b2%d0%b0
        minLenght = strings.get(0).length();
        int j = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (minLenght > strings.get(i).length()) {
                minLenght = strings.get(i).length(); //Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
                j = 0;
                listMin.clear();
                listMin.add(j, strings.get(i));
            } else if (minLenght == strings.get(i).length()) {
                listMin.add(j++, strings.get(i));
            }
        }

        for (int i = 0; i < listMin.size(); i++) { //Программа должна выводить самую короткую строку на экран.
            System.out.println(listMin.get(i));
        }
    }
}
