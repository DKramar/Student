package javarush.syntax.level3;
/*
Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги.
Пример вывода:
Red
Orange
Yellow
Green
Blue
Indigo
Violet
Каждый объект при создании выводит на экран определенный цвет.

Требования:
•	Программа должна выводить текст.
•	Нужно создать 7 различных объектов, отвечающих за цвета.
•	Порядок создания объектов должен соответствовать порядку цветов в радуге.
•	Классы отвечающие за цвета изменять нельзя.
•	Выведенный текст должен соответствовать заданию.
 */

public class EveryHunterWantsToKnow {
    public static void main(String[] args) {
        new Red();
        new Orange();
        new Yellow();
        new Green();
        new Blue();
        new Indigo();
        new Violet();
    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}
