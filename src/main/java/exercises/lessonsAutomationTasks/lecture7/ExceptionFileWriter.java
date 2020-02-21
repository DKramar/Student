package exercises.lessonsAutomationTasks.lecture7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionFileWriter {
    private String address;
    private String text;

    public ExceptionFileWriter(String address, String text) {
        this.address = address;
        this.text = text;
    }

    public File save() {
        File result = new File(this.address);
        if (result.exists()) {
            try {
                throw new Exception("File already exists");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try (FileWriter writer = new FileWriter(this.address, false)) {
                writer.write(this.text); // запись всей строки

            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
            System.out.println("The file has been written");
        }
        return result;
    }
}

