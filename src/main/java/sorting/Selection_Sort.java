package sorting;

public class Selection_Sort {
    public static void main(String[] args) {

        int arr[]={13,46,24,52,20,9};

        System.out.println("Before Sorting : ");
        for (int n: arr) {
            System.out.print(" "+ n );
        }

        for (int i = 0; i <arr.length-1; i++) {

            int mini =i;

            for (int j = i; j <arr.length ; j++) {

                if (arr[j] < arr[mini]) {
                    mini =j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;

            System.out.println();
            for (int num :arr ) {
                System.out.print(" "+ num);
            }
        }
        System.out.println();
        System.out.println("After Sorting : ");
        for (int n: arr) {
            System.out.print(" "+ n );
        }
    }
}
