package exercises.lessonsAutomationTasks.lecture5.task2;
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

public class Package {
    private String name;
    private String senderAddress;
    private String recipientAddress;
    private double weight;
    protected static double gramCost = 0.1;

    public Package(String name, String senderAddress, String recipientAddress, double weight) {
        this.name = name;
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }*/

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double basicPackageCost() {
        return this.getWeight() * /*(int)*/Package.gramCost;
    }

    @Override
    public String toString() {
        return "Name: " + name + ". " + "Sender address: " + senderAddress + ". " + "Recipient address: " + recipientAddress + ". " + "Weight: " + weight + " grams. " + "Gram cost: " + gramCost +"$";
    }
}
