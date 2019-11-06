package javarush.syntax.level6;
/*
Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.

Требования:
•	Добавь в класс Cat конструктор.
•	Конструктор должен быть public.
•	Добавь в класс Cat поле catCount.
•	Поле catCount должно быть типа int.
•	Поле catCount должно быть статическим.
•	Конструктор класса должен на 1 увеличивать значение переменной catCount.
 */

public class ClassCounter { // класс
    static int catCount; // объявление статической переменной

    public ClassCounter() { // конструктор
        ClassCounter.catCount++; // увеличение значения статической переменной на 1
    }

    public static void main(String[] args) {
    }
}
