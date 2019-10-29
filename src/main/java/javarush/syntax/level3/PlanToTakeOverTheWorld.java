package javarush.syntax.level3;
/*
Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя.
•	Выведенный текст должен содержать введенное число.
•	Выведенный текст должен полностью соответствовать заданию.
 */

    import java.io.*;

public class PlanToTakeOverTheWorld {
    public static void main(String[] args) throws Exception{
        /*
        Пример №1
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.

        Пример №2
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine(); //Читаем первую строку с клавиатуры
        String name = reader.readLine(); //Читаем вторую строку с клавиатуры
        //int num = Integer.parseInt(number); //Преобразовываем строку в число
        System.out.println(name + " захватит мир через " + number + " лет. Му-ха-ха!");
    }
}
