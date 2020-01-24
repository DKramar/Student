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

        int a = (int) (Math.random() * (11 + 10) - 10);
        int b = (int) (Math.random() * (11 + 10) - 10);
        int c = (int) (Math.random() * (11 + 10) - 10);
        int d = (int) (Math.random() * (11 + 10) - 10);

        Rational summa = new Rational(a, b, c, d);
        summa.summaResult();

        System.out.println(summa.summaResult());

        Rational substraction = new Rational(a, b, c, d);
        substraction.substractionResult();

        System.out.println(substraction.substractionResult());

        Rational multiplication = new Rational(a, b, c, d);
        multiplication.multiplicationResult();

        System.out.println(multiplication.multiplicationResult());

        Rational division = new Rational(a, b, c, d);
        division.divisionResult();

        System.out.println(division.divisionResult());
    }
}
