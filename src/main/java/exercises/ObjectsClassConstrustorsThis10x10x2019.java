package exercises;

public class ObjectsClassConstrustorsThis10x10x2019 {
    public static void main (String[] args){
        Person01 underf = new Person01();
        underf.displayInfo();

        Person01 tom = new Person01("Tom");
        tom.displayInfo();

        Person01 sam = new Person01("Sam", 25);
        sam.displayInfo();
    }
}

class Person01 {

    String name;
    int age;

    Person01(){
        this("Undefined", 18);
    }

    Person01(String name){
        this(name, 18);
    }

    Person01(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}