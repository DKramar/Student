package exercises.lessonsAutomationTasks.lecture9.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeavyBox {
    private List<Box> list = new ArrayList<Box>();

    public HeavyBox(List<Box> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "list=" + list +
                '}';
    }
}
