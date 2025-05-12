package recrusion;


import java.util.Scanner;

public class HashNumberOccurance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array :");
        int n = sc.nextInt();
        System.out.println("Input Number : "+n);
        int arr[]= new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //pre Compute
        int hash[]=new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] +=1;
        }

        System.out.println("Enter Number of Queries :" );
        int q=sc.nextInt();
        int number=0;
        while (q-- > 0) {
            number = sc.nextInt();
            System.out.println("Count of "+number + ":"+hash[number]);
        }

    }
}
