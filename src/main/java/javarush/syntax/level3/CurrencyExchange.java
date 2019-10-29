package javarush.syntax.level3;
/*
Напиши код метода convertEurToUsd, который переводит евро в доллары по заданному курсу.
Для возврата результата из метода convertEurToUsd используй оператор return. Пример: return 123*435;
Вызови метод convertEurToUsd дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс

Требования:
•	Метод convertEurToUsd должен умножать евро на курс и возвращать полученный результат.
•	Метод main должен 2 раза вызвать метод convertEurToUsd с любыми параметрами.
•	Метод main должен выводить результаты вызовов на экран, каждый раз с новой строки.
•	Метод convertEurToUsd не должен ничего выводить на экран.
 */

public class CurrencyExchange {
    public static void main(String[] args){
        System.out.println("долларСША = " + convertEuroToUsd(1, 29.5));
        System.out.println("долларСША = " + convertEuroToUsd(2, 29.5));

    }
    public static double convertEuroToUsd(int eur, double course){
        return eur*course;
    }
}
