package exercises.lessonsAutomationTasks.lecture7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private String address;
    private String text;

    public Writer(String address, String text) {
        this.address = address;
        this.text = text;
    }

    public File save() throws FileWriterException {
        File result = new File(this.address);
        if (result.exists()) {
            throw new FileWriterException("File already exists");
        } else {
            try (java.io.FileWriter writer = new java.io.FileWriter(this.address, false)) {
                writer.write(this.text); // запись всей строки

            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
            System.out.println("The file has been written");
        }
        return result;
    }
}

