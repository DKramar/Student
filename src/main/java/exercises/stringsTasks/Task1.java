package exercises.stringsTasks;

public class Task1 {
    public static void main(String[] args) {

        // Нахождение длины строки
        String str1 = "Java";
        String str2 = new String(); // пустая строка
        String str3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        char[] helloArray = str1.toCharArray(); // с помощью метода toCharArray() можно обратно преобразовать строку в массив символов
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4); // 3-начальный индекс, 4-кол-во символов
        String str5 = "Hello";
        System.out.println(str1.length());
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println();

        System.out.println(str5 + 2015); // Фактически же при сложении строк с нестроковыми объектами будет вызываться метод valueOf() класса String

        str1 = str1.concat(str5); // Метод concat() принимает строку, с которой надо объединить вызывающую строку, и возвращает соединенную строку.
        System.out.println(str1);

        str5 = String.join(" ", str5, str1); // метод join() позволяет объединить строки с учетом разделителя.
        System.out.println(str5);

        String str6 = "Example"; // извлечениe символов по индексу в классе String
        char c = str6.charAt(2);
        System.out.println(c);

    StringBuffer str7Buffer = new StringBuffer(str6); // Example (7 символов)
        System.out.println("Емкость: " + str7Buffer.capacity()); // 23 Конструктор без параметров резервирует в памяти место для 16 символов + Example (7 символов)
    }

}
