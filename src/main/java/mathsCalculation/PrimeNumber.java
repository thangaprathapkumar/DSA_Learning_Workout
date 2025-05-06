package mathsCalculation;

import java.util.Scanner;

public class PrimeNumber {

    static int primeNumber(int n) {
        int count =0;
        for (int i = 1; i * i <= n ; i++) {

            if ( n % i ==0) {
                count++;

                if((n / i ) != i)
                    count++;
            }
        }
        if (count == 2) {
            System.out.println(true);
            return count;
        }
        else {
            System.out.println(false);
            return count;
        }

   //     return count==2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you NUmber: ");

        int pri = scanner.nextInt();

        int prime = primeNumber(pri);

        System.out.println(prime);

    }
}
