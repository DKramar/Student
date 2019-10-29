package javarush.syntax.level4;
/*
Написать метод compare(int a), чтобы он:
- выводил на экран строку "Число меньше 5", если параметр метода меньше 5,
- выводил строку "Число больше 5", если параметр метода больше 5,
- выводил строку "Число равно 5", если параметр метода равен 5.

Требования:
•	Программа должна выводить текст на экран.
•	Метод main не должен вызывать System.out.println или System.out.print.
•	Метод main должен вызывать метод compare.
•	Метод compare должен быть void.
•	Метод compare должен выводить текст на экран согласно заданию.
 */

public class GoodOrBad {
    public static void main(String[] args){
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a){
        int s = 5;
        if (a<s) {
            System.out.println("Число " + a + " меньше " + s);
        }
            else if (a > s) {
            System.out.println("Число " + a + " больше " + s);
        }
            else{
            System.out.println("Число " + a + " равно " + s);
        }
    }
}

