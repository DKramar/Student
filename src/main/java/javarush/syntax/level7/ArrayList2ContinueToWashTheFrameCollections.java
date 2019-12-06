package javarush.syntax.level7;
/*
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Добавь в список слова: «мама», «мыла», «раму».
•	После каждого слова добавь в список строку, содержащую слово «именно».
•	Выведи элементы списка на экран, каждый с новой строки.
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2ContinueToWashTheFrameCollections {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "мама", "мыла", "раму");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "именно");
        }
    }
}
