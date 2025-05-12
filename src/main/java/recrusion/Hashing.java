package recrusion;

public class Hashing {

   static int f(int i,int arr[]) {

        int count=0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i) {
                count=count+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int arr[]={1,2,5,3,1,2,5,2};
        int fi = f(1,arr);
        System.out.println("No of times :"+fi);
    }
}
