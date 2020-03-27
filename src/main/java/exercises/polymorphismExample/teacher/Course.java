package exercises.polymorphismExample.teacher;

public class Course {
    private int id;
    private String name;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Название: " + name + "(" + id + ")";
    }
}
