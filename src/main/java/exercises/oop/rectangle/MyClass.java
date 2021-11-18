package exercises.oop.rectangle;

public class MyClass {
    public static void main(String[] args) {
        Point p = new Point(); // создал экземпляр класса Point
        p.x = 10; // присвоил полю значение
        p.y = 20; // присвоил полю значение

        Point p2 = new Point(); // создал экземпляр класса Point
        p2.x = 30; // присвоил полю значение
        p2.y = 40; // присвоил полю значение

        Point p3 = new Point(); // создал экземпляр класса Point
        p3.setA(56); // присвоил полю значение
        p3.setB(26); // присвоил полю значение

        Rectangle rect = new Rectangle();
        rect.topLeft.x = 0;
        rect.topLeft.y = 0;
        rect.bottomRight.x = 100;
        rect.bottomRight.y = 100;

        System.out.println(p.x + " " + p.y); // вывел на печать
        System.out.println(p2.x + " " + p2.y); // вывел на печать
        System.out.println(p3.getA() + " " + p3.getB()); // вывел на печать

        System.out.println(rect.topLeft.x + " " + rect.topLeft.y + " " + rect.bottomRight.x + " " + rect.bottomRight.y);
    }
}
