package javarush.syntax.level4;
/*
Напишите метод setCatsCount. Метод должен устанавливать количество котов (catsCount).

Требования:
•	Класс Cat должен содержать только одну переменную catsCount.
•	Переменная catsCount должна быть статической, иметь модификатор доступа private, тип int и проинициализирована нулем.
•	Класс Cat должен содержать два метода setCatsCount и main.
•	Метод setCatsCount класса Cat должен устанавливать значение переменной catsCount равным переданному параметру.
 */

public class SetTheNumberOfCats {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount){
        SetTheNumberOfCats.catsCount=catsCount;
    }

    public static void main(String[] args){
    }
}
