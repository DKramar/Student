package exercises.abstractExample.manager;

public class CourseManager extends AbstractManager {

   /* public CourseManager() {
        super();
    }*/

    public void assignGroupToCourse(int groupId, String nameCourse){
        System.out.println("группа " + groupId
                + " назначена на курс " + nameCourse);
    }
}
