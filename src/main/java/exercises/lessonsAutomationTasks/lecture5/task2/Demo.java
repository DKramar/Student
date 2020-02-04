package exercises.lessonsAutomationTasks.lecture5.task2;

public class Demo {
    /*
Создайте иерархию наследования посылок.
- Базовый класс - Package со следующими элементами: имя, адрес отправителя и получателя, вес (положительное число), цена доставки за грамм (константа double gramCost = 0.1).
Должен присутствовать метод вычисления стоимости доставки (basicPackageCost) как произведение веса на цену за грамм.
- Первый наследник - TwoDayPackage должен иметь функционал базового класса, включая дополнительный параметр постоянной наценки,
которая должна прибавляться к полученной цене за вес при вычислении стоимости доставки.
- Второй наследник - OverNightPackage должен иметь функционал базового класса, включая дополнительный параметр наценки за грамм,
которая должна прибавляться к цене доставки за грамм при вычислении стоимости доставки.

Требования к оформлению д/з:
- каждое задание в отдельном пакете
- каждый класс в отдельном файле
- каждое задание должно иметь отдельный класс (Demo)
- Demo класс должен продемонстрировать работу приложения:
создать массив Package[3], в который поместить по одному экземпляру каждого класса, в цикле пройтись по массиву вызывая метод вычисления стоимости посылки для каждого элемента, результат выводить в консоль
 */

    public static void main(String[] args) {
        Package basicPackage = new Package("Ivan", "address", "address", 200);
        //System.out.println(basicPackage.toString() + " DELIVERY WILL COST: " + basicPackage.basicPackageCost() + "$");

        TwoDayPackage twoDayPackage = new TwoDayPackage("Helen", "address", "address", 300, 20);
        //System.out.println(twoDayPackage.toString() + " DELIVERY WILL COST: " + twoDayPackage.twoDayPackageCost() + "$");

        OverNightPackage overNightPackage = new OverNightPackage("Vasia", "address", "address", 400, 2);
        //System.out.println(overNightPackage.toString() + " DELIVERY WILL COST: " + overNightPackage.overNightPackageCost() + "$");

        double[] Package = new double[]{basicPackage.basicPackageCost(), twoDayPackage.twoDayPackageCost(), overNightPackage.overNightPackageCost()};
        String[] toString = new String[]{basicPackage.toString(), twoDayPackage.toString(), overNightPackage.toString()};

        for (int i = 0; i < Package.length; i++) {
            System.out.println(toString[i] + " DELIVERY WILL COST: " + Package[i] + " $");
        }
    }


}
