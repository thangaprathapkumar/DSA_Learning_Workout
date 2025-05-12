package recrusion;

public class ProblemsUsingRecrusion
{
    public static void main(String[] args) {

        int ji=fun3(1,5);

        System.out.println(ji);

    }

    //print name 5 time
    static int f(int i,int n) {
        if ( i > n) {
            return i;
        }
        System.out.println("Toshila...");
       return f(i+1,n);

    }

    // print number from 1 to N
    static int fun1(int i,int n) {
        if ( i > n) {
            return i;
        }
        System.out.println("The I value : "+i);
        return fun1(i+1,n);
    }

    // print Linear from N to 1
    static int fun2(int i,int n) {
        if ( i < 1) {
            return i;
        }
        System.out.println("The I value : "+i);
        return fun2(i-1,n);
    }

    // print Linear from N to 1
    static int fun3(int i,int n) {
        if ( i > n) {
            return i;
        }
        fun3(i+1,n);
        System.out.println("The I value : "+i);
        return n;
    }

}
