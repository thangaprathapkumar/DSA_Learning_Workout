package mathsCalculation;

import java.util.Scanner;

public class AllDivisions {

    static int divisions(int n) {

        for (int i = 1; i<n; i++) {
            if (n % i == 0) {
                System.out.print( " "+ i +" ");
            }

        }
        return n;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter yuor Numbers : ");

        int divi = sc.nextInt();

        int divisi = divisions(divi);

        System.out.println(divisi);

    }

}
