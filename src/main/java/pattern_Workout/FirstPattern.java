package pattern_Workout;

import java.util.Scanner;

public class FirstPattern {

    static int n;

    public static void main(String[] args) {
        int t;

        Scanner sc = new Scanner(System.in);
        System.out.println( "Please Enter your NUmber : " );
            t = sc.nextInt();
        firstpatter(t);


    }

    static void firstpatter(int x) {

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < x; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
