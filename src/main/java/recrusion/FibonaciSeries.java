package recrusion;

public class FibonaciSeries {

    public static void main(String[] args) {
        int n=3;
        int ans = fib(n);
        System.out.println(ans);
    }

    static int fib(int n) {

        if (n <=1 ) {
            return n;
        }
        int last = fib(n-1);
        int slast = fib(n-2);
        return last + slast;

    }

}
