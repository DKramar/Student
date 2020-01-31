package javarush.syntax.level8;
/*
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Класс Solution должен содержать только три метода.
•	Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
•	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
 */
/*
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class CollectionsMoreThenTen {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>(); // Создал коллекцию set (реализация HashSet)
        set.add(23);
        set.add(234);
        set.add(232);
        set.add(21);
        set.add(22);
        set.add(13);
        set.add(3);
        set.add(567);
        set.add(199);
        set.add(67);
        set.add(290);
        set.add(90);
        set.add(34);
        set.add(62);
        set.add(45);
        set.add(6);
        set.add(5);
        set.add(89);
        set.add(57);
        set.add(32);
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num > 10) {
                iterator.remove();
            }
            else (num <= 10) {
            }
        }
        return;
    }

    public static void main(String[] args) {

    }
}
*/