package exercises.inhExample;

public class MyClass {
    public static void main(String[] args) {
        C obj = new C();
        obj.func1(); // A.func1()
        obj.func2(); // B.func1()
        obj.func3(); // C.func1()
    }
}
