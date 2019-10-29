package javarush.syntax.level5;
/*
Создать class Person. У человека должно быть имя String name, возраст int age, пол char sex.
Создайте геттеры и сеттеры для всех переменных класса Person.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	В классе Person должен быть метод public static void main.
•	Класс Person должен иметь 3 переменные.
•	У класса Person должна быть переменная name с типом String.
•	У класса Person должна быть переменная age с типом int.
•	У класса Person должна быть переменная sex с типом char.
•	У класса Person должен быть сеттер для переменной name.
•	У класса Person должен быть геттер для переменной name.
•	У класса Person должен быть сеттер для переменной age.
•	У класса Person должен быть геттер для переменной age.
•	У класса Person должен быть сеттер для переменной sex.
•	У класса Person должен быть геттер для переменной sex.
 */

public class GettersAndSettersForThePerson {
    public String name; //создаем переменную класса name с модификатором доступа public
    public String getName(){ //возвращаем значение переменной класса
        return name; // name переменная класса
    }
    public void setName(String name){ // присваивание нового значения переменной класса. Name - имя параметра
        this.name = name; // переменной класса присваиваем имя параметра
    }
    public int age; // создали переменную класса sex
    public int getAge(){ // возвратили значение переменной класса
        return age; //
    }
    public void setAge(int age){ //присваивание нового значения переменной класса. Age - имя параметра
        this.age = age;
    }
    public char sex; // создаем переменную класса
    public char getSex(){ // возвращаем значение переменной класса
        return sex;
    }
    public void setSex(char sex){ // Char - имя параметра
        this.sex = sex; // присваиваем переменной класса - имя параметра
    }
}
