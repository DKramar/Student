package javarush.syntax.level4;
/*
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.

Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS

Требования:
•	Программа не должна считывать текст c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить квадрат из 10х10 букв S.
•	В программе должен использоваться цикл while.
 */

public class FortuneTellingOnADollarAccount {
    public static void main(String[] args){
        /*for(int i=1;i<=10;i++){
            int a = 1;
            int b = 10;
            while(a<=b){
                System.out.print("S");
                b--;
            }
            System.out.println();
        }*/
        int c = 1;
        while(c<=10){
            int a = 1;
            int b = 10;
            while(a<=b){
                System.out.print("S");
                b--;
            }
            System.out.println();
            c++;
        }
    }
}
