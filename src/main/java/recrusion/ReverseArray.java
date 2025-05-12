package recrusion;


import static java.util.Collections.swap;

public class ReverseArray {

    static int f(int i,int arr[],int n) {

        if (i >=n/2) {
            return 0;
        }

        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        return f(i+1,arr,n);
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};

        int n = arr.length;
        f(0,arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+ arr[i] + " ");
        }
    }

}
