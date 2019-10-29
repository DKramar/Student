package exercises;

public class CatConstructors22x10x2019 {
    String name;
    int age;

    CatConstructors22x10x2019 (String name, int age){
        this.name = name;
        this.age = age;
    }

    CatConstructors22x10x2019 (String name){
        this.name = name;
    }

    public static void main(String[] args){
        CatConstructors22x10x2019 newCat = new CatConstructors22x10x2019("Sharik", 1);
        CatConstructors22x10x2019 oldCat = new CatConstructors22x10x2019("Murzic");

        System.out.println("New cat name: " + newCat.name + "; New cat age: " + newCat.age);
        System.out.println("Old cat name: " + oldCat.name);
    }
}
