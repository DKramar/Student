package exercises.lessonsAutomationTasks.lecture9.task1;

public class Box {
    private int boxWeight;
    private String boxName;

    public Box(int boxWeight, String boxName) {
        this.boxWeight = boxWeight;
        this.boxName = boxName;
    }

    public int getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(int boxWeight) {
        this.boxWeight = boxWeight;
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
