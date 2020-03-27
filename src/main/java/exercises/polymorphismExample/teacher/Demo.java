package exercises.polymorphismExample.teacher;

public class Demo {
    public static void main(String[] args) {
        DynDispatcher d = new DynDispatcher();

        Course cc = new Course(11, "Ivanov");
        d.infoCource(cc);

        BaseCourse bc = new BaseCourse(12, "Petrov", 1234);
        d.infoCource(bc);

        Optional oc = new Optional(13, "Sidorov", 12345, true);
        d.infoCource(oc);
    }
}
