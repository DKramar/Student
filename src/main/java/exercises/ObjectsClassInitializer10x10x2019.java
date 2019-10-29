package exercises;

public class ObjectsClassInitializer10x10x2019 {
    public static void main(String[] args){ // создали метод main
        Person02 undef = new Person02();
        undef.displayInfo();

        Person02 tom = new Person02("Tom");
        tom.displayInfo();
    }
}

class Person02{ // создали класс

    String name; // объявили переменные класса
    int age;

    { // начало блока инициализатора
        name = "Undefined"; // переменной класса присвоили значение
        age = 18; // переменной класса присвоили значение
    } // конец блока инициализатора

    Person02(){
    }

    Person02(String name){
        this.name = name;
    }

    Person02(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name:%s\tAge: %d\n", name, age);
    }
}


