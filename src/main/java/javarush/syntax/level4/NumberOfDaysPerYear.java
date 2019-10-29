package javarush.syntax.level4;
/*
Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
количество дней в году: x
, где
х - 366 для високосного года,
х - 365 для обычного года.

Подсказка:
В високосном году - 366 дней, тогда как в обычном - 365.
1) если год делится без остатка на 400 это високосный год;
2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
4) все оставшиеся года невисокосные.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 - не високосные.

Требования:
•	Программа должна считывать число c клавиатуры.
•	Программа должна выводить текст на экран, согласно условию.
•	Если введенный год является високосным, необходимо вывести текст: "количество дней в году: 366".
•	Если введенный год не является високосным, необходимо вывести текст: "количество дней в году: 365".
 */
import java.io.*;

public class NumberOfDaysPerYear {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВЕДИТЕ ГОД:");
        String year = reader.readLine();
        int yearInt = Integer.parseInt(year);
        if (yearInt%400==0 || (yearInt%100!=0 && yearInt==0)) {
            System.out.println("ГОД ЯВЛЯЕТСЯ ВИСОКОСНЫМ");
            System.out.println("количество дней в году: 366");
            }
        else {
            System.out.println("ГОД НЕ ЯВЛЯЕТСЯ ВИСОКОСНЫМ");
            System.out.println("количество дней в году: 365");
        }
    }
}