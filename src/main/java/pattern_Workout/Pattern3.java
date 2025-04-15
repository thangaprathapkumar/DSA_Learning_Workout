package pattern_Workout;

import java.util.Scanner;

public class Pattern3 {

   static int n;

    public static void main(String[] args) {

        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println( "Please Enter your NUmber : " );
        t= sc.nextInt();
        Patttern3(t);
    }

    static void Patttern3(int n) {

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

}
