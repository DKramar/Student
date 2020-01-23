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

//import static exercises.lessonsAutomationTasks.lecture5.task1.Rational.concut;

public class Demo {
    public static void main(String[] args) {

        int a = 0; /*(int) (Math.random() * (11+10)-10); // диапазон -10 до 10*/
        int b = (int) (Math.random() * (11+10)-10);
        int c = (int) (Math.random() * (11+10)-10);
        int d = (int) (Math.random() * (11+10)-10);

        System.out.println(a + "/" + b + " + " + c + "/" + d + " = " + Rational.summaNumerator(a, b, c, d) + "/" + Rational.summaDenominator(b, d) + Rational.zero(b, d));
        System.out.println(a + "/" + b + " - " + c + "/" + d + " = " + Rational.subtractionNumerator(a, b, c, d) + "/" + Rational.subtractionDenominator(b, d) + Rational.zero(b, d));
        System.out.println(a + "/" + b + " * " + c + "/" + d + " = " + Rational.multiplicationNumerator(a, b, c, d) + "/" + Rational.multiplicationDenominator(b, d) + Rational.zero(b, d));
        System.out.println(a + "/" + b + " / " + c + "/" + d + " = " + Rational.divisionNumerator(a, b, d) + "/" + Rational.divisionDenominator(b, c, d) + Rational.zero(b, d));

    }
}
