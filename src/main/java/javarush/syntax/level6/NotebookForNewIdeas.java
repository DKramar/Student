package javarush.syntax.level6;

/*
1. В классе Solution создать public static класс Idea.
2. В классе Idea создать метод public String getDescription(), который будет возвращать любую строку.
3. В классе Solution создай статический метод public void printIdea(Idea idea), который будет выводить
на экран описание идеи - это то, что возвращает метод getDescription().

Требования:
•	В классе Solution создать public static класс Idea.
•	В классе Idea создать метод public String getDescription().
•	Метод getDescription должен возвращать любую строку.
•	В классе Solution создайте метод public static void printIdea(Idea idea).
•	Метод printIdea должен выводить описание идеи на экран.
 */
public class NotebookForNewIdeas {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea {
        public String getDescription() {
            String a = "Note";
            return a;
        }
    }

    public static void printIdea(Idea idea) {
        // В статическом методе printIdea нужно вызвать метод getDescription.
        // Чтобы его вызвать, нужно обратиться к объекту класса, который в себе содержит этот метод.
        // Но создавать объект не нужно, он уже есть во входящих параметрах метода printIdea.
        // Поэтому в методе printIdea должно быть: System.out.println(idea.getDescription());
        System.out.println(idea.getDescription());
    }
}
