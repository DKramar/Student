package exercises.lessonsAutomationTasks.lecture6.examples;

import java.util.Objects;

public class Cucumber {
    private String color;
    private int length;

    public Cucumber (String color, int length){
        this.color = color;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cucumber cucumber = (Cucumber) o;
        return length == cucumber.length &&
                color.equals(cucumber.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, length);
    }
}
