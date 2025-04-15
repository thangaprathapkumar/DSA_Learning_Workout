package pattern_Workout;

import java.util.Scanner;

public class Pattern4 {



    static void patttern4(int n) {

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }

    static void patttern5(int n) {

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void patttern6(int n) {

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print( j + "  ");
            }
            System.out.println();
        }
    }

    static void patttern7(int n) {

        for (int i = 0; i <n; i++) {

            // space

            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    static void patttern8(int n) {

        for (int i = 0; i <n; i++) {

            // space

            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }

//            //stars
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

//            //space
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void patttern17(int n) {

        for (int i = 0; i <n; i++) {

            // space

            for (int j = 0; j<n-i-1; j++) {
                System.out.print("");
            }

//            //print character

            char ch='A';
            int breakpoint = (2*i+1) /2;
            for (int j = 0; j<2*i+1; j++) {
                System.out.print(ch);
                if (j < breakpoint) {
                    ch++;
                }
                else {
                    ch--;
                }
            }

//            //space
            for (int j = 0; j<n-i-1; j++) {
                System.out.print("");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Number : ");

        n = sc.nextInt();

        patttern8(n);

    }

}
