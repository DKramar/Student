package javarush.syntax.level7;
/*
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать массив на 10 строк.
•	Программа должна создавать массив на 10 целых чисел.
•	Программа должна считывать строки для массива с клавиатуры.
•	Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array1CommunicationOfLonelyArrays {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];// создаем и массив строк
        for (int i = 0; i < list.length; i++) { //заполняем данными с клавиатуры
            list[i] = reader.readLine();
        }
        for (int i = 0; i < list.length; i++) {
            int countLenght = 0;
            countLenght = countLenght + list[i].length();// считаем количество символов каждого элемента массива
            int[] numbers = new int[10]; // создаем числовой массив
            for (int j = 0; j < 1; j++) {
                System.out.println(numbers[j] + countLenght); // заполняем ячейки числового массива данными из стрингового массива
            }
        }
    }
}
