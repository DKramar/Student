package exercises.oop.createObjectsCat;

public class People {
  private String name;
  private int age;

  private Cat cat;

  public People(String name, int age, Cat cat) {
    this.name = name;
    this.age = age;
    this.cat = cat;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Cat getCat() {
    return cat;
  }

  public void setCat(Cat cat) {
    this.cat = cat;
  }

  @Override
  public String toString() {
    return "People Name: " + name + "; " + "People age: " + age + "; " + "People has cat: " + cat;
  }
}
