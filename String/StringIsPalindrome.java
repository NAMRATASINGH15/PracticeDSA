import java.util.Scanner;

public class StringIsPalindrome {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {

        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                ans += (char) (str.charAt(i) - 32);
            } else {
                ans += str.charAt(i);
            }
        }

        int start = 0;
        int end = ans.length() - 1;
        while (start < end) {
            if (ans.charAt(start) != ans.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

/*
Take as input String.

Write a Function to Check whether it is palindrome or not. if yes print true
otherwise false. Palindrome means string and it's reversed form are same

please Note: Lower and Upper case letter treated as equal.


Example(To be used only for expected output):

Input:
aBcba

output
true
*/
