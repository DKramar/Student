package exercises.abstractExample.manager;

public class Demo {
    public static void main(String[] args) {
        AbstractManager mng; // объявили ссылку
        // mng = new AbstractManager();нельзя создать объект!
        mng = new CourseManager();
        mng.assignGroupToCourse(11, "Алгебра");
    }
}
