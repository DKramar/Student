package exercises.lessonsAutomationTasks.lecture6.task1.packageMethodOverrides;

import java.util.Objects;

public class TwoDayPackage extends Package {

    private double permanentMargin; // постоянная наценка

    public TwoDayPackage(String name, String senderAddress, String recipientAddress, double weight, double permanentMargin) {
        super(name, senderAddress, recipientAddress, weight);
        this.permanentMargin = permanentMargin;
    }

    @Override
    public double basicPackageCost() {
        return super.basicPackageCost() + permanentMargin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TwoDayPackage that = (TwoDayPackage) o;
        return Double.compare(that.permanentMargin, permanentMargin) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), permanentMargin);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
