package exercises.lessonsAutomationTasks.lecture5.task2;

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double basicPackageCost() {
        return this.getWeight() * Package.gramCost;
    }

    @Override
    public String toString() {
        return "Name: " + name + ". " + "Sender address: " + senderAddress + ". " + "Recipient address: " + recipientAddress + ". " + "Weight: " + weight + " grams. " + "Gram cost: " + gramCost + "$";
    }
}
