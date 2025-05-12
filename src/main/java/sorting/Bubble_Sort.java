package sorting;

public class Bubble_Sort {

    public static void main(String[] args) {

        int arr[] = {13,46,24,52,20,9};

//        int arr[] = {1,2,3,4,5,6};

        System.out.println("Before Sorting : ");
        for (int n : arr)
        {
            System.out.print(" "+n);
        }
        int temp;
        for (int i = 0; i<arr.length-1 ; i++) {

            for (int j = 0; j<arr.length-1 ; j++) {

                if(arr[j] > arr[j+1]) {
                     temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
            System.out.println();
            for (int num :arr ) {
                System.out.print(" "+ num);
            }
        }

        System.out.println();
        System.out.println("After Sorting : ");
        for (int n : arr)
        {
            System.out.print(" "+n);
        }

    }
}
