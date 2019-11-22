package javarush.syntax.level7;
/*
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

Требования:
•	Программа должна создавать массив на 10 строк.
•	Программа должна считывать 8 строк для массива с клавиатуры.
•	Программа должна выводить на экран 10 строк, каждую с новой строки.
•	Программа должна выводить на экран массив (10 элементов) в обратном порядке.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseOrderArray {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] list = new String[3];
        for(int i = 0; i<list.length;i++){
            list[i] = reader.readLine();
        }
        for (int i = 9; i>=0; i--) {
            System.out.println(list[i]);
        }

    }
}
