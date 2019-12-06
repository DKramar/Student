package javarush.syntax.level7;
/*
Разделение массива на два — чётных и нечётных чисел
 */

import java.io.IOException;
import java.util.ArrayList;

public class ArrayList2ArraySplitting {
    public static void main(String[] args) throws IOException {
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8}; // статическая инициализация массива

        ArrayList<Integer> list = new ArrayList<Integer>(); //создание списка, где все элементы должны быть типа Integer

        for (int i = 0; i < data.length; i++) list.add(data[i]); //заполнение списка из массива

        ArrayList<Integer> even = new ArrayList<Integer>(); // массив четных чисел
        ArrayList<Integer> odd = new ArrayList<Integer>(); // массив нечетных чисел

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0) // если х - четное
                even.add(x); // добавляем х в коллекцию четных чисел
            else odd.add(x); // добавляем х в коллекцию нечетных чисел
        }

        System.out.println("EVEN:");
        for (int j = 0; j < even.size(); j++) {
            System.out.println(even.get(j));
        }

        System.out.println();
        System.out.println("ODD:");
        for (int i = 0; i < odd.size(); i++) {
            System.out.println(odd.get(i));
        }

    }
}
