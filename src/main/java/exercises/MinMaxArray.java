package exercises;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] array = {12, 3, 45, 67, 5, 67, 159};

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
        /*for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/
    }
}
