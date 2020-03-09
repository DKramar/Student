package exercises.lessonsAutomationTasks.lecture8.task1;
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
import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringDefinitionTask {

    private String sourceString; // исходная строка
    private String substring; // подстрока

    public void readStringFromConsole() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ВВЕДИТЕ ИСХОДНУЮ СТРОКУ:");
        this.sourceString = reader.readLine();

        System.out.println("ВВЕДИТЕ ПОДСТРОКУ:");
        this.substring = reader.readLine();
    }

    public int entranceString() {
        Pattern pattern = Pattern.compile(this.substring.toLowerCase());
        Matcher matcher = pattern.matcher(this.sourceString.toLowerCase());
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public String printFormat() {
        Formatter print = new Formatter();
        print.format("Строка \"%s\" встречается в строке \"%s\" %d раз(а)%n", substring, sourceString, entranceString());
        return print.toString();
    }
}

