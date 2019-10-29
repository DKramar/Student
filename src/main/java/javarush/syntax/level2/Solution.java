package javarush.syntax.level2;
/*
В методе print выведи на экран переданную строку 4 раза. Каждый раз с новой строки.

Требования:
•	Программа должна выводить текст на экран.
•	Метод main не должен вызывать System.out.println или System.out.print.
•	Метод print должен выводить текст на экран.
•	Метод main должен вызвать метод print класса Solution ровно два раза.
•	Метод print должен выводить на экран строку 4 раза. Каждый раз с новой строки.
 */

public class Solution {
    public static void main(String[] args){
        print("Java is easy to learn!"); //Обьявил метод print класса Solution
        print("Java opens many opportunities"); //Обьявил метод print класса Solution
    }

    public static void print(String s){ //присвоил правила и имя для метода принт
        for(int i=1; i<=4; i++){ // создал правила для метода print
            System.out.println(s); //вывел метод print на дисплей
        }
    }
}
