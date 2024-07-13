import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Take input
        String str = scn.nextLine();

        //Calling method
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {

        //Step1: Convert string into char array
        char[] ch = str.toCharArray();

        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return "".valueOf(ch);
    }
}
