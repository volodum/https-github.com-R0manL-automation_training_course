package lesson3;


public class _1_WhileLoopExample {

    public static void main(String[] args) {

        int a = 9;
        while(a < 10) {
            a = a + 1;
            System.out.println("A is: " + a);
        }

        System.out.println("---");

        int b = 0;
        do {
            b = b - 1;
            System.out.println("B is: " + b);
        } while (b > 0);
    }
}
