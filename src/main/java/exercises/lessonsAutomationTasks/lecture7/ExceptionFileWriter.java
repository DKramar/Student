package exercises.lessonsAutomationTasks.lecture7;
/*
Написать класс, в котором есть только один метод save, предназначенный для сохранения строки в файл.
Метод должен принимать два параметра: первый параметр - это строка/текст что будет сохранятся, второй параметр - это абсолютный путь к файлу в который будет сохранятся.

Если файл с таким именем не существует то его нужно будет создать.
Если файл с таким именем существует то выбросить исключение.

Исключение написать самому, оно должно быть unchecked.

Для реализации метода нужно воспользоваться классом java.io.File (https://docs.oracle.com/javase/7/docs/api/java/io/File.html)
Для проверки существует файл или нет использовать метод exists (https://docs.oracle.com/javase/7/docs/api/java/io/File.html#exists())
Для записи в файл использовать класс java.io.FileWriter (https://docs.oracle.com/javase/7/docs/api/java/io/FileWriter.html)
и его методом write (https://docs.oracle.com/javase/7/docs/api/java/io/Writer.html#write(java.lang.String))

Напомню, что FileWriter является ресурсом который нужно закрывать после использования. Рекомендую использовать конструкцию try with resources.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionFileWriter {
    public static void main(String[] args) {
        String address = "D://GD//Student//src//main//java//exercises//lessonsAutomationTasks//lecture7//notes.txt";
        //String text = "Hello World!";

        File myFile = new File(address);
        if (myFile.exists()) {
            System.out.println("File already exists");
        } else {
            try (FileWriter writer = new FileWriter(address, false)) {
                String text = "Hello World!";
                writer.write(text); // запись всей строки

            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
            System.out.println("The file has been written");
        }
    }
}
