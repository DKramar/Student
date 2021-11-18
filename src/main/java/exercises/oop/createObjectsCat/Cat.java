package exercises.oop.createObjectsCat;

public class Cat {
  private int age;
  private String name;
  private String type;

  public void say() {
    System.out.println("Мяу");
  }

  public Cat(int age, String name, String type) {
    this.age = age;
    this.name = name;
    this.type = type;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Name-" + name + "; " + "Age-" + age + "; " + "Type-" + type + ";";
  }
}
