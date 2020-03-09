package exercises.lessonsAutomationTasks.lecture8.task2;

public class StringBuilderReverseMethod {

    // String Builder
    public static String methodNameStringBuilder = "String Builder method reverse";

    public static StringBuilder stringBuilderReverse(String textToReverse) {
        StringBuilder toReverse = new StringBuilder(textToReverse);
        return toReverse.reverse();
    }

    public static long stringBuilderTime(String textToTime) {
        long startTime = System.nanoTime();
        stringBuilderReverse(textToTime);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
