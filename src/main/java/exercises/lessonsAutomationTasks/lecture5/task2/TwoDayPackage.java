package exercises.lessonsAutomationTasks.lecture5.task2;

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

}
