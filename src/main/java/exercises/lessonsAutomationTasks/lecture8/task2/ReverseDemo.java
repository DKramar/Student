package exercises.lessonsAutomationTasks.lecture8.task2;
/*
Написать программу “реверса” строки 5-ю разными способами.
Исходную строку считать с консоли.
Измерить время работы каждого из способов и результаты вывести на консоль.
 */

public class ReverseDemo {
    public static void main(String[] args) throws Exception {
        String stringFromUser = ReadFromConsole.readStringFromConsole();

        String[] methodName = new String[]{
                "String Buffer method reverse",
                "String Builder method reverse",
                "CharAt method reverse",
                "ToCharArray recursive method reverse",
                "ToCharArray cycle method reverse"
        };

        String[] reverseResult = new String[]{
                StringBufferReverseMethod.stringBufferReverse(stringFromUser).toString(),
                StringBuilderReverseMethod.stringBuilderReverse(stringFromUser).toString(),
                CharAtMethod.charAtReverse(stringFromUser),
                ToCharArrayRecursiveMethod.reverseStringWithRecursion(stringFromUser),
                ToCharArrayСycleMethod.toCharArrayReverse(stringFromUser).toString(),
        };

        long[] reverseTime = new long[]{
                StringBufferReverseMethod.stringBufferTime(stringFromUser),
                StringBuilderReverseMethod.stringBuilderTime(stringFromUser),
                CharAtMethod.charAtTime(stringFromUser),
                ToCharArrayRecursiveMethod.charAtTimeRecursive(stringFromUser),
                ToCharArrayСycleMethod.toCharArrayTime(stringFromUser)
        };

        for (int i = 0; i < reverseResult.length; i++) {
            System.out.printf("%s operation from \"%s\" to \"%s\" took: %d nano seconds %n", methodName[i], stringFromUser, reverseResult[i], reverseTime[i]);
        }
    }
}
