package javarush.syntax.level2;
/*
В методе public static void hackSalary(int a) увеличь зарплату на 100 и выведи на экран надпись: "Твоя зарплата составляет: <a+100> долларов в месяц."
Где <a+100> - это зарплата увеличенная на 100.

Пример вывода на экран для а = 700:
Твоя зарплата составляет: 800 долларов в месяц.

Требования:
•	Программа должна выводить текст на экран.
•	Метод main не должен вызывать System.out.println или System.out.print.
•	Метод hackSalary не должен возвращать результат.
•	Метод main должен вызвать метод hackSalary только один раз.
•	Метод hackSalary должен увеличить переданное число на 100 и вывести на экран надпись согласно шаблону.
 */

public class Salary {
    public static void main(String[] args){
        hackSalary(700);
    }

    public static void hackSalary(int a){
        System.out.println("Твоя зарплата составляет: " + (a+100) + " долларов в месяц");
    }
}
