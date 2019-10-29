package javarush.syntax.level4;
/*
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.

Требования:
•	Программа должна считывать две строки c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если имена одинаковые вывести сообщение "Имена идентичны"
•	Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
•	Если имена и длины имен разные - ничего не выводить.
 */
import java.io.*;

public class NastyaOrNastya {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВЕДИТЕ ПЕРВОЕ ИМЯ:");
        String name1 = reader.readLine();
        System.out.println("ВВЕДИТЕ ВТОРОЕ ИМЯ:");
        String name2 = reader.readLine();

        if(name1.equals(name2)){
            System.out.println("ИМЕНА ИДЕНТИЧНЫ");
        }
        else if(name1.length() == name2.length()){
            System.out.println("ДЛИНЫ ИМЕН РАВНЫ");
        }
        else{
            System.out.println("ИМЕНА И ДЛИНА ИМЕН НЕ РАВНЫ");
        }
    }
}

