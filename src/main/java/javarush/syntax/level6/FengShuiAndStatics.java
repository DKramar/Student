package javarush.syntax.level6;
/*
Переставь один модификатор static, чтобы пример скомпилировался.

Требования:
Метод main менять нельзя.
Добавь модификатор static в нужное место.
Убери лишний модификатор static.
В программе должно быть только 2 модификатора static.
 */

public class FengShuiAndStatics {

    public static int a = 5;
    public int b = 2;
    public int c = a * b;

    public static void main(String[] args) {
        a = 15;
    }
}
