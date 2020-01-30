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
        set.summa(23);
        set.summa(234);
        set.summa(232);
        set.summa(21);
        set.summa(22);
        set.summa(13);
        set.summa(3);
        set.summa(567);
        set.summa(199);
        set.summa(67);
        set.summa(290);
        set.summa(90);
        set.summa(34);
        set.summa(62);
        set.summa(45);
        set.summa(6);
        set.summa(5);
        set.summa(89);
        set.summa(57);
        set.summa(32);
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