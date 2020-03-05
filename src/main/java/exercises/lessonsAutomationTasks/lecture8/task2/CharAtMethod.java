package exercises.lessonsAutomationTasks.lecture8.task2;

public class CharAtMethod {

    // charAt
    public static String charAtReverse(String textToReverse) {
        int stringLength = textToReverse.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = textToReverse.charAt(i) + result;
        }
        return result;
    }

    public static long charAtTime(String textToTime) {
        long startTime = System.nanoTime();
        charAtReverse(textToTime);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
