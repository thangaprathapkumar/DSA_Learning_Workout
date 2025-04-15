package mathsCalculation;

import java.util.Scanner;

public class AllDivisions {

    static int divisions(int n) {

        int sum=0;

        for (int i = 1; i<=n; i++) {
            if (n % i == 0) {
                sum +=i;
            }
            System.out.println(i);
        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter yuor Numbers : ");

        int divi = sc.nextInt();

        int divisi = divisions(divi);

        System.out.println(divisi);

    }

}
