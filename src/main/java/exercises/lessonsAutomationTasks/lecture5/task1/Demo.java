package exercises.lessonsAutomationTasks.lecture5.task1;
/*
Создайте класс Rational для выполнения арифметический действий с простыми дробями,
значение должно храниться в несокращённом виде, используя целочисленные переменные.
Должны поддерживаться такие операции:
сложение двух рациональных чисел;
вычитание двух рациональных чисел;
умножение двух рациональных чисел;
деление двух рациональных чисел;
печать рациональных чисел в консоле в виде a/b
	* Дополнительно:
дробь должна храниться в упрощенном виде (2/4 => 1/2)
предотвратить деление на ноль (1/0)
Требования к оформлению д/з:
каждое задание в отдельном пакете
каждый класс в отдельном файле
каждое задание должно иметь отдельный класс (Demo)
Demo класс должен продемонстрировать работу приложения:
создать несколько рациональных чисел, вывести их в консоль, показать выполнение всех операций с выводом результатов в консоль
 */

public class Demo {
    public static void main(String[] args) {
        Rational n1 = new Rational(); // создал экземпляр класса. Первая дробь
        n1.numer = (int) (Math.random() * (10 - 2 + 1) + 2);// числитель. Присвоил значение
        n1.denom = (int) (Math.random() * (10 - 2 + 1) + 2);// знаменатель. Присвоил значение

        Rational n2 = new Rational(); // создал экземпляр класса. Вторая дробь
        n2.numer = (int) (Math.random() * (10 - 2 + 1) + 2);// числитель. Присвоил значение
        n2.denom = (int) (Math.random() * (10 - 2 + 1) + 2);// знаменатель. Присвоил значение

        Rational resultSum = new Rational();
        resultSum.numer = n1.numer*n2.denom + n2.numer*n1.denom;
        resultSum.denom = n1.denom * n2.denom;
        System.out.println("Summa: " + n1.numer + "/" + n1.denom + " + " + n2.numer + "/" + n2.denom + " = " + resultSum.numer + "/" + resultSum.denom);

        Rational resultSubt = new Rational();
        resultSubt.numer = n1.numer*n2.denom - n2.numer*n1.denom;
        resultSubt.denom = n1.denom * n2.denom;
        System.out.println("Subtraction: " + n1.numer + "/" + n1.denom + " - " + n2.numer + "/" + n2.denom + " = " + resultSubt.numer + "/" + resultSubt.denom);

        Rational resultMult = new Rational();
        resultMult.numer = n1.numer * n2.numer;
        resultMult.denom = n1.denom * n2.denom;
        System.out.println("Multiplication: " + n1.numer + "/" + n1.denom + " * " + n2.numer + "/" + n2.denom + " = " + resultMult.numer + "/" + resultMult.denom);

        Rational resultDiv = new Rational();
        resultDiv.numer = n1.numer * n2.denom;
        resultDiv.denom = n1.denom * n2.numer;
        System.out.println("Division: " + n1.numer + "/" + n1.denom + " / " + n2.numer + "/" + n2.denom + " = " + resultDiv.numer + "/" + resultDiv.denom);
    }
}
