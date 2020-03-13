package exercises.lessonsAutomationTasks.lecture7;

import java.io.File;
import java.io.IOException;

public class Writer {
    private String address;
    private String text;

    public Writer(String address, String text) {
        this.address = address;
        this.text = text;
    }

    public File save() throws IOException {
        File result = new File(this.address);
        if (result.exists()) {
            throw new FileWriterException("File already exists");
        }
        try (java.io.FileWriter writer = new java.io.FileWriter(this.address, false)) { // try-with-resources.
            writer.write(this.text); // запись всей строки
        }
        return result;
    }
}