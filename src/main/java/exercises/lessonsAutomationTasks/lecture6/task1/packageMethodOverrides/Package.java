package exercises.lessonsAutomationTasks.lecture6.task1.packageMethodOverrides;

import java.util.Objects;

public class Package implements Cloneable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package aPackage = (Package) o;
        return Double.compare(aPackage.weight, weight) == 0 &&
                name.equals(aPackage.name) &&
                senderAddress.equals(aPackage.senderAddress) &&
                recipientAddress.equals(aPackage.recipientAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, senderAddress, recipientAddress, weight);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
