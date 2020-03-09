package exercises.lessonsAutomationTasks.lecture8.task2;

public class StringBufferReverseMethod {

    // String Buffer
    public static String methodNameStringBuffer = "String Buffer method reverse";

    public static StringBuffer stringBufferReverse(String textToReverse) {
        StringBuffer toReverse = new StringBuffer(textToReverse);
        return toReverse.reverse();
    }

    public static long stringBufferTime(String textToTime) {
        long startTime = System.nanoTime();
        stringBufferReverse(textToTime);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
