package exercises.lessonsAutomationTasks.lecture7;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {

        Writer myFile = new Writer("D://GD//Student//src//main//java//exercises//lessonsAutomationTasks//lecture7//notes.txt", "Hello World!");
        myFile.save();

        // в фaйле есть данные
    }
}
