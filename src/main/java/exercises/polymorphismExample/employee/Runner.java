package exercises.polymorphismExample.employee;

public class Runner {
    public static void main(String[] args) {
        Employee b1 = new Employee(7119);
        Employee b2 = new Manager(9547, 31);
        b1.typeEmployee(); //вызов версии из класса Employee
        b2.typeEmployee(); //вызов версии из класса Manager
        Manager b3 = new Manager(9711, 35);
        System.out.println(b3.getIdProject());
        System.out.println(b3.getId());
    }
}
