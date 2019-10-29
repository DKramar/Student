package exercises;

public class ObjectsClassConstructors10x10x2019 {
    public static void main(String[] args){ // основной метод main
        Person01 bob = new Person01(); // создаем объект bob
        bob.displayInfo();

        Person01 tom = new Person01("Tom"); // создаем объект tom
        tom.displayInfo();

        Person01 sam = new Person01("Sam", 25); // создаем объект sam
        sam.displayInfo();
    }
}

class Person{ // создаем класс Person01
    String name; // объявляем переменную класса
    int age; // объявляем переменную класса
    Person(){
        name = "Undefined";
        age = 18;
    }
    Person(String n){
        name = n;
        age = 18;
    }
    Person(String n, int a){
        name = n;
        age = a;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}