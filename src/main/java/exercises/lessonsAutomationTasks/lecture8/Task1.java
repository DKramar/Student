package exercises.lessonsAutomationTasks.lecture8;
/*
Написать программу для подсчета количества вхождений подстроки в строку, поиск подстроки производить без учета регистра.
Исходную строку и подстроку для поиска считывать из консоли.
Результат работы программы вывести на консоль.
Использовать форматирование строки.

Пример форматированного вывода:
Строка “java” встречается в строке “I like java! Java is the best language!” 2 раз.
Строка “java” встречается в строке “JavajavaJAVA” 3 раз.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВЕДИТЕ ИСХОДНУЮ СТРОКУ:");
        String sourceString = reader.readLine();
        String sourceStringLowerCase = sourceString.toLowerCase();

        System.out.println("ВВЕДИТЕ ПОДСТРОКУ:");
        String substring = reader.readLine();
        String substringLowerCase = substring.toLowerCase();

        Pattern pattern = Pattern.compile(substringLowerCase);
        Matcher matcher = pattern.matcher(sourceStringLowerCase);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.printf("%s%n", "Строка", substring, "встречается в строке", sourceString, count,"раз" );
    }
}
