package recrusion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterHashing
{
    public static void main(String[] args) {
        String s ="thangamprathapkumar";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your No of query :");

        int hash[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
        int q=sc.nextInt();

        while (q-- >0) {
            char c=sc.next().charAt(0);
            System.out.println("The chater is :"+c +"--->"+hash[c]);
        }

    }
}
