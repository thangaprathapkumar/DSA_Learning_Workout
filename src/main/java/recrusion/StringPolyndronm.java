package recrusion;

public class StringPolyndronm {

    public static void main(String[] args) {

      //  String s = "Mummy";
        String s = "radar";
        boolean reveStr = polyStrng(0,s);
      //  boolean reveStr = validPalindrome(s);
        System.out.println(reveStr);
    }

     static boolean polyStrng(int i, String s) {
        if (i >=s.length() / 2) {
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
            return false;
        }


        return polyStrng(i+1,s);
    }

    public static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

}
