package exercises.lessonsAutomationTasks.lecture8.task2;
/*
Написать программу “реверса” строки 5-ю разными способами.
Исходную строку считать с консоли.
Измерить время работы каждого из способов и результаты вывести на консоль.
 */

public class ReverseDemo {
    public static void main(String[] args) throws Exception{
        ReverseMethods revers = new ReverseMethods();

        System.out.printf("String Buffer method reverse operation from \"%s\" to \"%s\" took: %d nano seconds %n", revers.toString(), revers.StringBufferReverse(), revers.StringBufferTime());
        System.out.printf("String Builder method reverse operation from \"%s\" to \"%s\" took: %d nano seconds %n", revers.toString(), revers.StringBuilderReverse(), revers.StringBuilderTime());
        System.out.printf("??? reverse method operation from \"%s\" to \"%s\" took: %d nano seconds %n", revers.toString(), revers.StringBufferReverse(), revers.StringBufferTime());
        System.out.printf("ToCharArray method reverse operation from \"%s\" to \"%s\" took: %d nano seconds %n", revers.toString(), revers.toCharArrayReverse(), revers.toCharArrayTime());
        System.out.printf("CharAt method reverse operation from \"%s\" to \"%s\" took: %d nano seconds %n", revers.toString(), revers.charAtReverse(), revers.charAtTime());
    }
}
