package exercises;

import java.util.*;

public class Variables {

    static boolean bul = false; // true or false
    static byte bt = 127; // хранит целое число от -128 до 127 и занимает 1 байт
    static short sh = 32767; // хранит целое число от -32768 до 32767 и занимает 2 байта
    static int in = 2147483647; // хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
    static long ln = 345645324; // хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
    static double db = 1.8 * 10308; // хранит число с плавающей точкой от ±4.9*10-324 до ±1.8*10308 и занимает 8 байт
    static float fl = 3.4f; // хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта


    public static void main(String[] args) {
        System.out.println("boolean: " + bul);
        System.out.println("byte: " + bt);
        System.out.println("short: " + sh);
        System.out.println("integer: " + in);
        System.out.println("long: " + ln);
        System.out.println("dooble: " + db);
        System.out.println("float: " + fl);
    }
}
