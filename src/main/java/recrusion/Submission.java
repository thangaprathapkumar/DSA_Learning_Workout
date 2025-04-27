package recrusion;

public class Submission
{

    static int sum(int n) {

        if (n == 0) { return 0; }
       return n + sum(n - 1);

    }

    public static void main(String[] args) {

        int n=3;
        int sumfunction = sum(n);
        System.out.println(sumfunction);

    }

}
