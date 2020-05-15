package exercises.lessonsAutomationTasks.lecture9.task1;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args){
        HeavyBox package1 = new HeavyBox(
                new Box(12, "box1"),
                new Box(4, "box2"),
                new Box(10, "box3"));
        System.out.printf("circle_1 coordinate center: %s%n", package1.toString());
    }
}
