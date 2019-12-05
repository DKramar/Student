package javarush.syntax.level7;
/*
Ввод списка целых чисел с клавиатуры
 */

import javafx.scene.control.Tab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ListOfIntegersArrayList {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите масив целых чисел:");
        System.out.println("!!! Для завершения ввода данных - нажми ENTER ");
        ArrayList<String> list = new ArrayList<String>();


        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("%-20s%-20s%-20s%n", "Данные строк", "Индекс строки", "Длинна строки");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < list.size(); i++) {
            int l = list.get(i).length();

            System.out.printf("%-20s%-20s%-20s%n", list.get(i), i, l);
        }
        System.out.println("------------------------------------------------------");
    }
}
