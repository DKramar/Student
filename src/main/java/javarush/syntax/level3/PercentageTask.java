package javarush.syntax.level3;
/*
Напиши код метода addTenPercent, который увеличивает переданное целое число на 10%.
Для возврата результата из метода addTenPercent используй оператор return.

Пример:
return 123 * 435;

Требования:
•	Метод addTenPercent должен увеличивать переданное число на 10% процентов.
•	Метод main должен вызывать метод addTenPercent.
•	Метод main должен выводить результаты вызова на экран.
•	Метод addTenPercent не должен ничего выводить на экран.
 */

public class PercentageTask {
    public static double addTenPercent(int i){

        return i+(i*10.0/100.0);
    }
    public static void main(String[] args){

        System.out.println(addTenPercent(8));
    }
}
