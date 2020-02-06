package exercises.abstractExampl;

public class Employee extends Person {

    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override // Аннотация вывода на печать
    public void display() {
        System.out.println("Name : " + getName());
        System.out.println("Company : " + company);
    }

    public static void main(String[] args){
        //Person person = new Person("Ivan"); // Ошибка компиляции. Нельзя создавать экземпляры абстракного класса
        Employee employee = new Employee("Artem", "Nix");
        Person somePerson = new Employee("Igor", "Nix");

        employee.display();
        somePerson.display();
    }
}
