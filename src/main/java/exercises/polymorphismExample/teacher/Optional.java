package exercises.polymorphismExample.teacher;

public class Optional extends BaseCourse {
    private boolean required;

    public Optional(int id, String name, int idTeacher, boolean required) {
        super(id, name, idTeacher);
        this.required = required;
    }

    @Override
    public String toString() {
        return super.toString() + " required->" + required;
    }
}
