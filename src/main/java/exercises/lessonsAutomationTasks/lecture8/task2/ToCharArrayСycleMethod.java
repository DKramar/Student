package exercises.lessonsAutomationTasks.lecture8.task2;

public class ToCharArrayСycleMethod {

    // toCharArray (перестановка в цикле)
    public static String metodNameToCharArraCycle = "ToCharArray cycle method reverse";

    public static Object toCharArrayReverse(String textToReverse) {
        char[] reverseArray = textToReverse.toCharArray();
        String result = "";
        for (int i = 0, j = reverseArray.length - 1; i < j; ++i, --j) {
            char tmp = reverseArray[i];
            reverseArray[i] = reverseArray[j];
            reverseArray[j] = tmp;
        }
        for (int i = reverseArray.length - 1; i >= 0; i--) {
            result = reverseArray[i] + result;
        }
        return result;
    }

    public static long toCharArrayTime(String textToTime) {
        long startTime = System.nanoTime();
        toCharArrayReverse(textToTime);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
