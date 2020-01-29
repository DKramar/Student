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

        Rational fraction1 = new Rational();
        fraction1.setA(a);
        fraction1.setB(b);

        Rational fraction2 = new Rational();
        fraction2.setC(c);
        fraction2.setD(d);

        Rational result = new Rational();
        result.summaNumerator();
        result.summaDenominator();
        /*num1.summaNumerator(num2);*/


        System.out.println(a + "/" + b + " + " + c + "/" + d + " = " + result.summaNumerator() + "/" + result.summaDenominator());


        /*Rational result = new Rational(a, b, c, d);
        result.summaResult();
        result.substractionResult();
        result.multiplicationResult();
        result.divisionResult();

        System.out.println(result.summaResult());
        System.out.println(result.substractionResult());
        System.out.println(result.multiplicationResult());
        System.out.println(result.divisionResult());*/

        /*System.out.println(Rational.summaResult(a, b, c, d));
        System.out.println(Rational.substractionResult(a, b, c, d));
        System.out.println(Rational.multiplicationResult(a, b, c, d));
        System.out.println(Rational.divisionResult(a, b, c, d));*/
    }
}
