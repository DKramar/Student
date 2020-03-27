package exercises.polymorphismExample.teacher;

public class BaseCourse extends Course{
    private  int idTeacher;

    public BaseCourse(int id, String name, int idTeacher) {
        super(id, name);
        this.idTeacher = idTeacher;
    }

    @Override
    public String toString() {
        return super.toString() + " препод.ID (" + idTeacher + ")";
    }
}
