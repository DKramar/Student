package exercises;

public class Counter {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("... 0%");
        for (int i = 5; i < 101; i +=5) { //
            Thread.sleep(1000);
            System.out.print("\r..." + i + "%");
        }
        System.out.println();
    }
}
