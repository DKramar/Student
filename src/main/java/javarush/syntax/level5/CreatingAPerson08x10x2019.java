package javarush.syntax.level5;
/*
Создать class Person. У человека должно быть имя String name, возраст int age.
Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
В методе main создай объект Person, занеси его ссылку в переменную person.
Вызови метод initialize с любыми значениями.

Требования:
•	Класс Solution должен содержать класс Person.
•	У класса Person должна быть переменная name с типом String.
•	У класса Person должна быть переменная age с типом int.
•	У класса Person должен быть метод initialize, принимающий в качестве параметра имя, возраст и инициализирующий соответствующие переменные класса.
•	Необходимо создать объект типа Person и занести его ссылку в переменную person.
•	Необходимо вызвать метод initialize у созданного объекта и передать в него какие-либо параметры.
 */

public class CreatingAPerson08x10x2019 {
    public static void main(String[] args){
        Person person = new Person(); // создал объект типа Person, занес его ссылку в переменную person
        person.initialize("Vasia", 45); // вызвал метод initialize у созданного объекта и передал в него параметры

    }

    static class Person{ // создал класс Person
        public String name; // объявил переменную
        public int age; // объявил переменную
        public void initialize(String name, int age){ // создал метод initialize, принимающий в качестве параметра имя, возраст и инициализирующий соответствующие переменные класса.
            this.name = name;
            this.age = age;
        }
    }
}
