import java.util.Scanner;

public class StringInsertDifference {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(stringInsertDiff(str));
    }

    public static String stringInsertDiff(String str) {

        String ans = "";

        for (int i = 0; i < str.length() - 1; i++) {
            ans += str.charAt(i);

            int diff = str.charAt(i+1) - str.charAt(i);

            ans += diff;
        }

        ans += str.charAt(str.length()-1);
        //return answer
        return ans;
    }
}
/*
1.Take as input String.

Write a code that inserts between each pair of characters the difference
between their ascii codes. Print the final string.

Note: You can use adding at the end of the string

Example:

Input:
abfk

output
a1b4f5k

1 = b-a
4 = f-b
5 = k-f
*/
