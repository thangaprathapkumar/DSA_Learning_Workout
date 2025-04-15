package mathsCalculation;

import java.util.Scanner;

import static java.lang.Math.log10;

public class DigitNumbers {

    static int countDigit(int n) {
        int count=0;
    //    int original = n;
        while (n > 0) {

            int last_digit = n % 10;

//            if (last_digit != 0 && original % last_digit == 0) {
//                count++;
//            }

            count = count + 1;

            n = n / 10;
        }
        System.out.println("The Digit count is : "+count);
        return count;

    }

    static int countDigitlogs(int n) {


        int count = (int) log10(n) +1;

        System.out.println(count);
        return count;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Digit :");
        int num =sc.nextInt();
        countDigit(num);

     //   countDigitlogs(num);

    }

}
