package javarush.syntax.level7;
/*
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
•	Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
•	Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
•	Должна быть выведена только одна строка.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*public class ArrayList2BestOfTheBestNOTSOLVED {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<String> listMin = new ArrayList<String>(); // создал список строк
        ArrayList<String> listMax = new ArrayList<String>(); // создал список строк
        int maxLenght;
        int minLenght;

        for (int i = 0; i < 3; i++) {
            String s = reader.readLine();
            strings.summa(i, s); // добавил строки введенные с клавиатуры в список
        }

        maxLenght = strings.get(0).length();
        minLenght = strings.get(0).length();

        // НАХОДИМ МАКСИМАЛЬНЫЙ ЭЛЕМЕНТ
        int j = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (maxLenght < strings.get(i).length()) {
                maxLenght = strings.get(i).length(); //Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
                //j = 0;
                listMax.clear();
                listMax.summa(i, strings.get(i));
            }
            //else if (maxLenght == strings.get(i).length()) {
            //    listMax.summa(j++, strings.get(i));
            //}
            System.out.println(listMax.get(i));
        }

        for (int i = 0; i < listMax.size(); i++) { //Программа должна выводить самую длинную строку на экран.
            System.out.println("Max row: " + listMax.get(i));
        }

        // НАХОДИМ МИНИМАЛЬНЫЙ ЭЛЕМЕНТ
        int k = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (minLenght > strings.get(i).length()) {
                minLenght = strings.get(i).length(); //Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
                k = 0;
                listMin.clear();
                listMin.summa(k, strings.get(i));
            }
            else if (minLenght == strings.get(i).length()) {
                listMin.summa(k++, strings.get(i));
            }
        }

        for (int i = 0; i < listMin.size(); i++) { //Программа должна выводить самую короткую строку на экран.
            System.out.println("Min row: " + listMin.get(i));
        }

        // СРАВНИВАЕМ ИНДЕКСЫ МИНИМАЛЬНОГО И МАКСИМАЛЬНОГО ЭЛЕМЕНТА СТРОЧНОГО МАССИВА
        for (int i = 0; i < strings.size(); i++) {
            if (strings.indexOf(listMin.get(i)) < strings.indexOf(listMax.get(i))) { //Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
                System.out.println("Min row was before max: " + listMin.get(i));
            } else {
                System.out.println("Max row was before min: " + listMax.get(i)); //Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
            }
        }

    }
}

 */