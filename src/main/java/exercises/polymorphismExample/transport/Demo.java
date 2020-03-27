package exercises.polymorphismExample.transport;

public class Demo {
    public static void main(String[] args) {
        RepairingFactory rc = new RepairingFactory();
        Transport[] box = new Transport[15];
        for (int i = 0; i < box.length; i++)
            /* заполнение массива единицами проверямого транспорта */
            box[i] = rc.getClassFromFactory(2);// 2 вида транспорта
        for (Transport s : box)
            s.repair();// вызов полиморфного метода
    }
}
