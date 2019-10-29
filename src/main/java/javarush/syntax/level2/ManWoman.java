package javarush.syntax.level2;

public class ManWoman {
    public static void main(String[] args) {
        Man man = new Man(); // ТипПеременной имяПеременной = new ТипСоздаваемогоОбъекта(); Здесь Man - это класс, new Man() - это процесс создания объекта, а man - это переменная (ссылка), которая ссылается на конкретный объект.
        Woman woman = new Woman(); //ТипПеременной имяПеременной = new ТипСоздаваемогоОбъекта();
        woman.husband = man; //В woman.husband сохрани ссылку на ранее созданный объект Man (подсказка: woman.husband = man;).
        man.wife = woman; //В man.wife сохрани ссылку на ранее созданный объект Woman.;
    }

    public static class Man{
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman{
        public int age;
        public int height;
        public Man husband;
    }
}
