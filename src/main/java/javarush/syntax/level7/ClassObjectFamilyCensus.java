package javarush.syntax.level7;
/*
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
•	Добавить в класс конструктор public Human(String name, boolean sex, int age).
•	Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
•	Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
•	Выведи созданные объекты на экран.
 */

public class ClassObjectFamilyCensus {
    public static void main(String[] args) {
        // Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
        Human grandFather1 = new Human("Вова", true, 74);
        Human grandFather2 = new Human("Петя", true, 68);
        Human grandMother1 = new Human("Маша", false, 72);
        Human grandMother2 = new Human("Лена", false, 63);
        Human father = new Human("Дима", true, 45, grandFather1, grandMother1);
        Human mother = new Human("Даша", false, 40, grandFather2, grandMother2);
        Human child1 = new Human("Яна", false, 15, father, mother);
        Human child2 = new Human("Юля", false, 12, father, mother);
        Human child3 = new Human("Лена", false, 10, father, mother);

        System.out.println(grandFather1 + "\n" + grandFather2 + "\n" + grandMother1 + "\n" + grandMother2 + "\n" + father + "\n" + mother + "\n" + child1 + "\n" + child2 + "\n" + child3);
    }

    public static class Human { // создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) { // Добавить в класс конструктор public Human(String name, boolean sex, int age)
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) { // Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother)
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() { // Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}
