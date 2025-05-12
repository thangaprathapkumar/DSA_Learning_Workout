package recrusion;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashNumberUsingMap {

    //RECOMMENDED FOR CODING


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
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println("The Key is :"+entry.getKey() +"-->" + entry.getValue());
        }

//        System.out.println("Enter Number of Queries :" );
//        int q=sc.nextInt();
//        int number=0;
//        while (q-- > 0) {
//            number = sc.nextInt();
//            System.out.println("Count of "+number + ":"+map.get(number));
//        }

    }

//    static int hashing() {
//
//        int arr[] = {1,2,3,4,5,4,3,3,2,1};
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//            int key = arr[i];
//            map.put(key,map.getOrDefault(key,0)+1);
//        }
//
//        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
//            System.out.println("The key is :"+entry.getKey() + "---> " + entry.getValue());
//        }
//    }

}
