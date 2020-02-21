package exercises.lessonsAutomationTasks.lecture7;
/*
Написать класс, в котором есть только один метод save, предназначенный для сохранения строки в файл.
Метод должен принимать два параметра: первый параметр - это строка/текст что будет сохранятся, второй параметр - это абсолютный путь к файлу в который будет сохранятся.

Если файл с таким именем не существует то его нужно будет создать.
Если файл с таким именем существует то выбросить исключение.

Исключение написать самому, оно должно быть unchecked.

Для реализации метода нужно воспользоваться классом java.io.File (https://docs.oracle.com/javase/7/docs/api/java/io/File.html)
Для проверки существует файл или нет использовать метод exists (https://docs.oracle.com/javase/7/docs/api/java/io/File.html#exists())
Для записи в файл использовать класс java.io.Writer (https://docs.oracle.com/javase/7/docs/api/java/io/FileWriter.html)
и его методом write (https://docs.oracle.com/javase/7/docs/api/java/io/Writer.html#write(java.lang.String))

Напомню, что Writer является ресурсом который нужно закрывать после использования. Рекомендую использовать конструкцию try with resources.
 */

public class Demo {
    public static void main(String[] args) {

        Writer myFile = new Writer("D://GD//Student//src//main//java//exercises//lessonsAutomationTasks//lecture7//notes.txt", "Hello World!");
        myFile.save();
    }
}
