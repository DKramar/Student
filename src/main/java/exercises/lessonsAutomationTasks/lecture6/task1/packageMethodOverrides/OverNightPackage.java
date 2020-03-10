package exercises.lessonsAutomationTasks.lecture6.task1.packageMethodOverrides;

public class OverNightPackage extends Package {

    private double markupPerGram; // наценка на грамм

    public OverNightPackage(String name, String senderAddress, String recipientAddress, double weight, double markupPerGram) {
        super(name, senderAddress, recipientAddress, weight);
        this.markupPerGram = markupPerGram;
    }

    @Override
    public double basicPackageCost() {
        return this.getWeight() * (Package.gramCost + markupPerGram);
    }
}
