package javarush.syntax.level8;
/*
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".

Требования:
•	Не изменяй заголовок метода createSet().
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createSet() должен создавать и возвращать множество (реализация HashSet).
•	Множество из метода createSet() должно содержать 20 слов на букву «Л».
 */

import java.util.HashSet;
import java.util.Set;


public class CollectiontsCreateTwentyNamesOnL {
    public static Set<String> createSet() { // Объявили метод createSet()
        //напишите тут ваш код
        Set<String>set = new HashSet<>(); // создали коллекцию set (реализация HashSet)
        set.add("Л01"); // Множество из метода createSet() должно содержать 20 слов на букву «Л».
        set.add("Л02");
        set.add("Л03");
        set.add("Л04");
        set.add("Л05");
        set.add("Л06");
        set.add("Л07");
        set.add("Л08");
        set.add("Л09");
        set.add("Л10");
        set.add("Л11");
        set.add("Л12");
        set.add("Л13");
        set.add("Л14");
        set.add("Л15");
        set.add("Л16");
        set.add("Л17");
        set.add("Л18");
        set.add("Л19");
        set.add("Л20");
        return set; // Метод createSet() возвращаeт множество
    }

    public static void main(String[] args) {

    }
}
