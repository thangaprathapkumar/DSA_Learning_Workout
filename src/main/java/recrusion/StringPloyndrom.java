package recrusion;

public class StringPloyndrom
{

    static boolean ployndrop(int i,String s) {

        if (i >=s.length() / 2) {
            return true;
        }
        if (s.charAt(i)!=s.charAt(s.length()-i-1)) {
            return false;
        }
        return ployndrop(i+1,s);
    }

    public static void main(String[] args) {

        String str ="AMMA";

       boolean status = ployndrop(0,str);

        System.out.println("The Status is :"+status);

    }
}
