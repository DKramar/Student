package javarush.syntax.level8;
/*
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.

Требования:
•	Программа должна выводить число на экран.
•	Программа должна считывать значения с клавиатуры.
•	В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
•	Программа должна добавлять в коллекцию 10 чисел, согласно условию.
•	Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LincedListArrayListLongestSequenceNOTSOLVED {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainList = new ArrayList<Integer>(); // создал список строк
        ArrayList<Integer> countList = new ArrayList<Integer>();

        for (int i = 0; i < 4; i++) { // заполнили массив данными
            String s = reader.readLine();
            int l = Integer.parseInt(s);
            mainList.add(i, l);
        }

        int countEquals = 1;
        int counter = 0;
        for (int i = 0; i<mainList.size(); i++){
            for (int j = 0; j<mainList.size(); j++) {
                System.out.println(i);
                System.out.println(j);
                if (mainList.get(i).equals(mainList.get(j+1))){
                    countEquals++;
                    countList.add(counter, countEquals);
                }
                else{
                    mainList.get(j+1);
                }
                counter ++;
            }
        }

        for (int i = 0; i < countList.size(); i++) { //Программа должна выводить самую короткую строку на экран.
            System.out.println(countList.get(i));
        }
/*
        int max = countList.get(0);
        for (int j = 0; j < countList.size(); j++) {
            if (countList.get(j) > max) {
                max = countList.get(j);
            }
            System.out.println(max);
        }

 */
    }
}