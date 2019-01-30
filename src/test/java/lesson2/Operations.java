package lesson2;

public class Operations {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("---Task 8 ---");
        int t = 14;
        int q = 7;
        t %= q; //0
        System.out.println(t++); //0

        System.out.println("---Task 9 ---");
        int x1 = 4;
        int y1 = 2;
        System.out.println(x1++ * y1--);//8

        System.out.println("---Task 10 ---");
        int a1 = 13;
        int b1 = a1 % 5; //3
        a1 = 11;
        System.out.println(b1 * a1); //33

        System.out.println("---Task 11 ---");
        int m = 5;
        int n = m + m - m * m / m;
        System.out.println(n); //5

        System.out.println("---Task 12 ---");
        int k = 1;
        int l = 2;
        l += --k + l - k; //l=l+2 (0+2-0)
        System.out.println(l);

        System.out.println("---Task 13 ---");
        int a2 = 7;
        int c2 = 5;
        a2 = c2 % a2; //a2=5
        System.out.println(a2 % c2); //0

        System.out.println("---Task 14 ---");
        int i3 = 10;
        double d3 = 5.5;
        boolean b3 = (i3 == d3); //false
        System.out.println(b3);

        System.out.println("---Task 15 ---");
        System.out.println("one" + "two"); //no space

        System.out.println("---Task 16---");
        int x = 7;
        //2.  double x = "rocks";
        String xx = "training";
        //4. int x = 45.5;

        System.out.println("---Task 17---");
        int a4 = 5;
        int b4 = 4;
        a4 -= (b4++) + (++a4);// a4=5-(4+6)
        System.out.println(a4);

        System.out.println("---Task 18---");
        System.out.println((5 * 6) % 14 + 4); // 6

        System.out.println("---Task 19---");
        int s = 5;
        System.out.println(++s - s--); // 0  s=6-1
        System.out.println(s); // 5

        System.out.println("---Task 20---");
        int f = 16;
        int g = 3;
        g += ++f; //g=20
        System.out.println(g++); // 20

    }
}