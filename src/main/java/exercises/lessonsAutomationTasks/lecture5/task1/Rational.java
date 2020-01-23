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

public class Rational {


    public static int summaNumerator(int a, int b, int c, int d) {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = a * d + b * c;
        }
        return result;
    }

    public static int summaDenominator(int b, int d) {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = b * d;
        }
        return result;
    }

    public static int subtractionNumerator(int a, int b, int c, int d) {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = a * d - b * c;
        }
        return result;
    }

    public static int subtractionDenominator(int b, int d) {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = b * d;
        }
        return result;
    }

    public static int multiplicationNumerator(int a, int b, int c, int d) {
        int result;
        if (b == 0 || d == 0 || a == 0 || c == 0) {
            result = 0;
        } else {
            result = a * c;
        }
        return result;
    }

    public static int multiplicationDenominator(int b, int d) {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = b * d;
        }
        return result;
    }

    public static int divisionNumerator(int a, int b, int d) {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = a * d;
        }
        return result;
    }

    public static int divisionDenominator(int b, int c, int d) {
        int result;
        if (b == 0 || d == 0) {
            result = 0;
        } else {
            result = b * c;
        }
        return result;
    }

    public static String zero(int b, int d) {
        String n;
        if (b == 0 || d == 0) {
            n = " Division by zero";
        } else {
            n = " ";
        }
        return n;
    }
}
