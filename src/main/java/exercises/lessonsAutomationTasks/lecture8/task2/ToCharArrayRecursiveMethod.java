package exercises.lessonsAutomationTasks.lecture8.task2;

public class ToCharArrayRecursiveMethod {

    // toCharArrayRecursive (вывод с конца строки)
    public static String reverseStringWithRecursion(String textToReverse) {
        String rightPart;
        String leftPart;
        int length = textToReverse.length();

        // заканчиваем рекурсивный обход
        if (length <= 1) {
            return textToReverse;
        }

        leftPart = textToReverse.substring(0, length / 2);
        rightPart = textToReverse.substring(length / 2, length);
        return reverseStringWithRecursion(rightPart) + reverseStringWithRecursion(leftPart); // рекурсивно переворачиваем левую и правую часть входной строки
    }

    public static long charAtTimeRecursive(String textToTime) {
        long startTime = System.nanoTime();
        reverseStringWithRecursion(textToTime);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
