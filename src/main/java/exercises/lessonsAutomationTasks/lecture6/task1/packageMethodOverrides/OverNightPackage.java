package exercises.lessonsAutomationTasks.lecture6.task1.packageMethodOverrides;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OverNightPackage that = (OverNightPackage) o;
        return Double.compare(that.markupPerGram, markupPerGram) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), markupPerGram);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
