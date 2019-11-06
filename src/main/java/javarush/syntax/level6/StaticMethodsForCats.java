package javarush.syntax.level6;
/*
Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
с помощью которых можно получить/изменить количество котов (переменную catCount).

Требования:
•	Добавь в класс метод getCatCount.
•	Метод getCatCount должен возвращать int.
•	Метод getCatCount должен возвращать значение переменной catCount.
•	Добавь в класс метод setCatCount, принимающий int.
•	Метод setCatCount ничего не должен возвращать.
•	Метод setCatCount должен присваивать переменной catCount переданное значение.
 */

public class StaticMethodsForCats {
    private static int catCount = 0;

    public StaticMethodsForCats() {
        catCount++;
    }

    public static int getCatCount() { // статический метод get
        return catCount; // возвращает значение переменной catCount
    }

    public static void setCatCount(int catCount) { // статический метод set
        StaticMethodsForCats.catCount = catCount; // метод присваивает переменной catCount переданное значение
    }

    public static void main(String[] args) {
    }
}
