package javarush.syntax.level3;
/*
Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".

Пример:
Я буду зарабатывать $50 в час

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное число n.
•	Выведенный тест должен полностью соответствовать заданию.
 */

import java.io.*;

public class FinancialExpectations {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*
        BufferedReader при считывании данных использует специальную область — буфер, куда “складывает” прочитанные символы.
        В итоге, когда эти символы понадобятся нам в программе — они будут взяты из буфера, а не напрямую из источника
        данных (клавиатуры, файла и т.п.), а это экономит очень много ресурсов.

        System.in — это объект класса InputStream,
        InputStreamReader - получает данные из потока. Он еще и преобразует байтовые потоки в символьные.
        */
        String number = reader.readLine();
        System.out.println("Я буду зарабатывать $" + number + " в час");


    }

}
