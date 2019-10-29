package javarush.syntax.level5;
/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем false

Должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false

Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
•	Если ничья, то метод fight должен возвращать false.
 */

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat(){
    }
    public boolean fight(Cat anotherCat){

        int countCat1 = 0;
        int countCat2 = 0;
        if(this.weight>anotherCat.weight){
            countCat1++;
        }
        else {
            countCat2++;
        }
        if(this.weight<anotherCat.weight){
            countCat2++;
        }
        if(this.age>anotherCat.age){
            countCat1++;
        }
        if(this.age<anotherCat.age){
            countCat2++;
        }
        if(this.strength>anotherCat.strength){
             countCat1++;
        }
        if(this.strength<anotherCat.strength){
            countCat2++;
        }
        if(countCat1>countCat2){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        /*Cat cat_1 = new Cat();
        cat_1.age = 13;

        Cat cat_2 = new Cat();
        cat_2.age = 10;

        cat_1.fight(cat_2);*/
    }
}
