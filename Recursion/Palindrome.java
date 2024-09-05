import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        char[] ch = {'M', 'A', 'L', 'A', 'A', 'L', 'A', 'M'};

        System.out.println(isPalindrome(ch, 0, ch.length-1));
    }

    public static boolean isPalindrome(char[] ch, int sp, int ep) {
        //Base Case for odd number of characters
        if (sp == ep) {
            return true;
        }
        //Base case for even number of characters
        if (sp > ep) {
            return true;
        }

        //Main logic
        if (ch[sp] != ch[ep]) {
            return false;
        } else {
            boolean temp = isPalindrome(ch, sp+1, ep-1);
            return temp;
        }
    }
}
