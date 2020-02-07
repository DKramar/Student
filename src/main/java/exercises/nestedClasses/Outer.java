package exercises.nestedClasses;

public class Outer {

    class Inner { // Простой вложенный класс
        public void show(){
            System.out.println("Метод внутреннего класса");
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
