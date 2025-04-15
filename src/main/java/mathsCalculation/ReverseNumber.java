package mathsCalculation;

import java.util.Scanner;

public class ReverseNumber {

    static int reverseNum(int n) {

        int reverseNum = 0;

        while (n != 0) {

            int ld = n % 10 ;
            // Check for overflow/underflow before it happens
//            if (reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE / 10 && ld > 7)) {
//                return 0;
//            }
//            if (reverseNum < Integer.MIN_VALUE / 10 || (reverseNum == Integer.MIN_VALUE / 10 && ld < -8)) {
//                return 0;
//            }
            reverseNum = (reverseNum * 10 ) + ld ;

            n = n / 10 ;

        }
        return reverseNum;
    }


    static boolean polyndronNumber(int n) {

        int reverseNum = 0;
        int dup = n;
        while (n > 0) {

            int ld = n % 10 ;

            reverseNum = (reverseNum * 10 ) + ld ;

            n = n / 10;
        }
        return dup==reverseNum;
    }

    static int amstrongNumber(int n) {

        int reverseNum = 0;
        int sum = 0;
        int dup = n;
        while (n > 0) {

            int ld = n % 10 ;

            sum = sum + (ld * ld * ld);

            reverseNum = (reverseNum * 10 ) + ld ;

            n = n / 10;
        }

        if (dup == sum)
        {
            System.out.println("Amstrong Number");
        }
        else {
            System.out.println("Not Amstrong Number");
        }
        return sum;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you Number : ");

        int numRev = scanner.nextInt();

    //    int revNums = reverseNum(numRev);

    //    boolean revNums = polyndronNumber(numRev);

        int revNums = amstrongNumber(numRev);

        System.out.println(revNums);

    }
}
