package javarush.syntax.level7;
/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

Требования:
•	В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
•	Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
•	Программа должна выводить самую длинную строку на экран.
•	Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LongestLineArrayList {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listMax = new ArrayList<String>(); // создал список строк
        strings = new ArrayList<String>();
        int maxLenght;

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            LongestLineArrayList.strings.add(i, s); // добавил строки введенные с клавиатуры в список
        }

        //Возможно поможет - https://ru.stackoverflow.com/questions/634119/%d0%9f%d0%be%d0%b8%d1%81%d0%ba-%d0%b8%d0%bd%d0%b4%d0%b5%d0%ba%d1%81%d0%be%d0%b2-%d0%bc%d0%b8%d0%bd%d0%b8%d0%bc%d0%b0%d0%bb%d1%8c%d0%bd%d0%be%d0%b3%d0%be-%d0%b8-%d0%bc%d0%b0%d0%ba%d1%81%d0%b8%d0%bc%d0%b0%d0%bb%d1%8c%d0%bd%d0%be%d0%b3%d0%be-%d1%8d%d0%bb%d0%b5%d0%bc%d0%b5%d0%bd%d1%82%d0%be%d0%b2-%d0%bc%d0%b0%d1%81%d1%81%d0%b8%d0%b2%d0%b0
        maxLenght = strings.get(0).length();
        int j = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (maxLenght < strings.get(i).length()) {
                maxLenght = strings.get(i).length(); //Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
                j = 0;
                listMax.clear();
                listMax.add(j, strings.get(i));
            } else if (maxLenght == strings.get(i).length()) {
                listMax.add(j++, strings.get(i));
            }
        }

        for (int i = 0; i < listMax.size(); i++) { //Программа должна выводить самую длинную строку на экран.
            System.out.println(listMax.get(i));
        }
    }
}
