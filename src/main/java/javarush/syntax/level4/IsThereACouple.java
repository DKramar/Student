package javarush.syntax.level4;
/*
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если два числа равны между собой, необходимо вывести числа на экран.
•	Если все три числа равны между собой, необходимо вывести все три.
•	Если нет равных чисел, ничего не выводить.
 */
import java.io.*;

public class IsThereACouple {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВЕДИТЕ ПЕРВОЕ ЧИСЛО:");
        String num1 = reader.readLine();
        int num1Int = Integer.parseInt(num1);
        System.out.println("ВВЕДИТЕ ВТОРОЕ ЧИСЛО:");
        String num2 = reader.readLine();
        int num2Int = Integer.parseInt(num2);
        System.out.println("ВВЕДИТЕ ТРЕТЬЕ ЧИСЛО:");
        String num3 = reader.readLine();
        int num3Int = Integer.parseInt(num3);
        if(num1Int == num2Int && num1Int ==num3Int){
                System.out.print("ВСЕ ВВЕДЕННЫЕ ЧИСЛА " + num1Int + " " + num1Int + " " + num1Int + "  МЕЖДУ СОБОЙ РАВНЫ");
            }
            else if(num1Int == num2Int && num1Int!=num3Int){
                System.out.println("ПАРА РАВНЫХ МЕЖДУ СОБОЙ ЧИСЕЛ: " + num1Int + " " +num2Int);
            }
            else if(num2Int == num3Int && num2Int!=num1Int){
                System.out.println("ПАРА РАВНЫХ МЕЖДУ СОБОЙ ЧИСЕЛ: " + num2Int + " " + num3Int);
            }
            else if(num1Int == num3Int && num1Int!=num2Int){
                System.out.println("ПАРА РАВНЫХ МЕЖДУ СОБОЙ ЧИСЕЛ: " + num1Int + " " + num3Int);
            }
            else {
                System.out.print("ВВЕДЕННЫЕ ЧИСЛА " + num1Int + " " + num2Int + " " + num3Int + " НЕ РАВНЫ");
            }

        }

    }
