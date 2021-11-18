package exercises.oop.createObjectsCat;

public class Main {
  static Cat cat;
  static People people;

  public static void main(String[] args) {

    cat = new Cat(15, "CAT", "PERS");
    people = new People("HUMAN", 15, cat);

    people.setCat(cat);
    people.getCat().setName("MURZIK");

    System.out.println(people);
    cat.say();
    people.getCat().say();
  }
}
