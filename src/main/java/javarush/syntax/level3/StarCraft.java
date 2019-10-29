package javarush.syntax.level3;
/*
Создать 5 зергов, 3 протосса и 4 террана.
Дать им всем уникальные имена.

Требования:
•	Нельзя изменять классы Zerg, Protoss и Terran.
•	Нужно создать 5 объектов типа Zerg и каждому из них дать свое имя.
•	Нужно создать 3 объекта типа Protoss и каждому из них дать свое имя.
•	Нужно создать 4 объекта типа Terran и каждому из них дать свое имя.
 */

public class StarCraft {
    public static void main(String[] args){
    Zerg zerg1 = new Zerg();
        zerg1.name = "Zerg name1";
    Zerg zerg2 = new Zerg();
        zerg2.name = "Zerg name2";
    Zerg zerg3 = new Zerg();
        zerg3.name = "Zerg name3";
    Zerg zerg4 = new Zerg();
        zerg4.name = "Zerg name4";
    Zerg zerg5 = new Zerg();
        zerg5.name = "Zerg name5";

    Protoss protoss1 = new Protoss();
        protoss1.name = "Protos name1";
    Protoss protoss2 = new Protoss();
        protoss2.name = "Protoss name2";
    Protoss protoss3 = new Protoss();
        protoss3.name = "Protoss name3";

    Terran terran1 = new Terran();
        terran1.name = "Terran name1";
    Terran terran2 = new Terran();
        terran2.name = "Terran name2";
    Terran terran3 = new Terran();
        terran3.name = "Terran name3";
    Terran terran4 = new Terran();
        terran4.name = "Terran name4";

    System.out.println("Zerg team:");
        System.out.println("---------------");
        System.out.println(zerg1.name);
        System.out.println(zerg2.name);
        System.out.println(zerg3.name);
        System.out.println(zerg4.name);
        System.out.println(zerg5.name);
        System.out.println(" ");

    System.out.println("Protoss team:");
        System.out.println("---------------");
        System.out.println(protoss1.name);
        System.out.println(protoss2.name);
        System.out.println(protoss3.name);
        System.out.println(" ");

    System.out.println("Terran team:");
        System.out.println("---------------");
        System.out.println(terran1.name);
        System.out.println(terran2.name);
        System.out.println(terran3.name);
        System.out.println(terran4.name);
        System.out.println(" ");



        /*
    Protoss protoss = new Protoss();
    Protoss object11 = new Protoss();
    Protoss object22 = new Protoss();
    Protoss object33 = new Protoss();
    Terran terran = new Terran();
    Terran object111 = new Terran();
    Terran object222 = new Terran();
    Terran object333 = new Terran();
    Terran object444 = new Terran();*/
    }

    public static class Zerg{
        public String name;
    }

    public static class Protoss{
        public String name;
    }

    public static class Terran{
        public String name;
    }
}
