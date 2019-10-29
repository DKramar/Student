package javarush.syntax.level4;
/*
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888

Требования:
•	Программа должна считывать два числа c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить прямоугольник размером m на n из восьмёрок.
•	В программе должен использоваться цикл for.
 */
import java.io.*;

public class DrawRectangleNOTPASSED {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("INPUT NUMBER OF ROWS");
        String r = reader.readLine();
        int r1 = Integer.parseInt(r);

        System.out.println("INPUT NUMBER OF COLUMNS");
        String c = reader.readLine();
        int c1 = Integer.parseInt(c);

        int startRow = 1;
        for(int i = 1;startRow<=r1;i++){
            System.out.println();
            startRow ++;

            int startColumn = 1;
            for(int j = 1;startColumn<=c1;j++){
                System.out.print("* ");
                startColumn++;
            }
        }
    }
}
