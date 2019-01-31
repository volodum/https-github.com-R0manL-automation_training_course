package lesson3;

import java.util.Scanner;

/**
 * Created by o.kulpa on 07.01.2019.
 */
public class Cycles {
    public static void main (String[] args)
    {
        System.out.println("Task 1");
        if (false){
            System.out.println("FALSE");
        } else {
            System.out.println("TRUE");
        }

        System.out.println("Task 2");
        String name="Solo";
        if (name.length() == 4){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        System.out.println("Task 3");
        int x = 8;
        int y = 2;
        int sum = x + y;
        for (int i = 1; i<=3; i++){
            sum+=i;
        }
        System.out.println(sum);

        System.out.println("Task 4");
        int k=1;
        sum=10;
        while(k !=5){
            sum+=k;
            k++;
        }
        System.out.println(sum);

        System.out.println("Task 5");
        int z=1;
        for (int i=1; i<5; i++)
        {
            System.out.println(z+i);
        }

        System.out.println("Task 6");
        int[] a = {1, 2, 3};
        int p = 2;
        for (int i = 0; i < 3; i++){
            p*=a[i];
        }
        System.out.println(p);

        System.out.println("Task 7");
        int[] arr = {3, 4, 2, 1};
        int m = arr[0];
        for (int n = 0; n < arr.length; n++){
            if (arr[n] > m){
                m = arr[n];
            }
        }
        System.out.println(m);

        System.out.println("Task 8");
        int[] b={5, 6, 3, 8, 7};
        for (int i : b){
            if (i%2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("Task 9");
        boolean c = false;
        while (c == true){
            System.out.println(c);
        }

        System.out.println("Task 10");
        Integer[][] grid ={
                {3, 5, 567},
                {0, 8, 2},
                {3, 4, 2}
        };
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                System.out.println(grid[i][j]);
            }
        }

        System.out.println("Task 11");
        System.out.println("Set 1st number and press enter");
        System.out.println("Set 2nd number and press enter");
        System.out.println("Choose operation: \n 1 -- sum, \n 2 -- sub, \n 3 -- mult, \n 4 -- div, \n 5 -- compare \n and press enter");

        Scanner s = new Scanner(System.in);
        double a1 = s.nextDouble();
        double b1 = s.nextDouble();
        int choice = s.nextInt();

        switch (choice){
            case 1:
                System.out.println(a1 + b1); break;
            case 2:
                System.out.println(a1 - b1); break;
            case 3:
                System.out.println(a1 * b1); break;
            case 4: if (b1 == 0){
                System.out.println("Division by zero is not allowed");
            }else {
                System.out.println(a1 / b1);
            }; break;
            case 5: if (a1 > b1) {
                System.out.println(a1 + " is greater than " + b1);
            } else if (a1 < b1){
                System.out.println(a1 + " is less than "+ b1);
            } else {
                System.out.println(a1 + " is equal to " + b1);
            }; break;
            default:
                System.out.println("Wrong choice of operation");
        }

    }
}
