package pattern_Workout;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Patter Number : ");
        n = sc.nextInt();
        secondPatttern(n);


    }

    static void secondPatttern(int n) {

        for (int i = 0; i <=n; i++) {

            for (int j = 0; j <i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
