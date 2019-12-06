package javarush.syntax.level7;
/*
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать большой массив на 20 целых чисел.
•	Программа должна считывать с клавиатуры 20 чисел для большого массива.
•	Программа должна создавать два маленьких массива на 10 чисел каждый.
•	Программа должна скопировать одну половину большого массива в первый маленький,
а вторую - во второй и вывести второй маленький массив на экран.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array1OneBigTwoSmallArrays {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] big = new int[4];
        for (int i = 0; i < big.length; i++) {
            big[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 2; i++) {
            int[] smallOne = new int[2];
            for (int j = 0; j < 1; j++) {
                int result = smallOne[j] + big[i];
            }
        }
        for (int i = 2; i < 4; i++) {
            int[] smallTwo = new int[2];
            for (int y = 0; y < 1; y++) {
                int resultTwo = smallTwo[y] + big[i];
                System.out.println(resultTwo);
            }
        }
    }
}
