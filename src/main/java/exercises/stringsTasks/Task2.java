package exercises.stringsTasks;

public class Task2 {
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = "I work";
        boolean result = str1.regionMatches(6, str2, 2, 3);
        System.out.println(result); // true
    }
}
