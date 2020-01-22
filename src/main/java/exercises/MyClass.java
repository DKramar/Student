package exercises;

public class MyClass {
    public static void main(String[] args) {
        Point p = new Point(); // создал экземпляр класса Point
        p.x = 10; // присвоил полю значение
        p.y = 20; // присвоил полю значение
        Point p2 = new Point(); // создал экземпляр класса Point
        p2.x = 30; // присвоил полю значение
        p2.y = 40; // присвоил полю значение
        System.out.println(p.x + " " + p.y); // вывел на печать
        System.out.println(p2.x + " " + p2.y); // вывел на печать
    }
}
