package exercises.exceptionsTasks;

public class TestThree {

    private ABC abc;

    public void foo() {

/*
        System.out.println(1 / 0);

        int array[] = {1, 2, 3};
        array[5] = 3;
*/

        try {
            abc.show();
        } catch (Exception ex) {
//            ex.printStackTrace();
            System.err.println("Деление на ноль");
        }
    }
}
