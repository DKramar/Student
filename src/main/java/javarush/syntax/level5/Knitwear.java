package javarush.syntax.level5;
/*
Пару задач назад студенты секретного центра JavaRush создавали класс Cat.
Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat,
а точнее - основываясь на нём, как на шаблоне. Их - котов - должно быть трое.
Наполните этих троих жизнью, то есть, конкретными данными.


Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Нужно создать три объекта типа Cat.
•	Класс Cat нельзя изменять.
•	Программа не должна выводить данные на экран.
 */

public class Knitwear {
    public static void main(String[]args){
        Cat cat01 = new Cat("Vaska",2,3,10);
        Cat cat02 = new Cat("Murzik",2,3,10);
        Cat cat03 = new Cat("Ogonek",3,4,8);
    }
    public static class Cat{
        private String name; // переменная класса
        private int age; // переменная класса
        private int weight; //переменная класса
        private int streigth; //переменная класса

        public Cat(String name, int age, int weight, int streigth){ //имя параметра
            this.name = name; // имя переменной класса совпадает с именем параметра поэтому this
            this.age = age;
            this.weight = weight;
            this.streigth = streigth;
        }
    }
}
