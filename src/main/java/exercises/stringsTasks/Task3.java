package exercises.stringsTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws Exception {
        String one = readerMothod("ENTER STRING ONE");
        String two = readerMothod("ENTER STRING TWO");

        System.out.println(one);
        System.out.println(two);
    }

    private static String readerMothod(String row) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(row);
        return reader.readLine();
    }
}
