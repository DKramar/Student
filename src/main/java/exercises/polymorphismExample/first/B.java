package exercises.polymorphismExample.first;

public class B extends A {
    @Override
    public void func(){
        System.out.println("B.func()");
        super.func(); // вызываем метод базовового класса
    }
}
