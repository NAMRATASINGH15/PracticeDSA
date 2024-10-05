import java.util.Scanner;

public class CountOfaaa {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(countaaa1(str,0));

        System.out.println(countaaa2(str,0));
    }

    public static int countaaa1(String str, int index) {
        //Base Case
        if  (index >= str.length()-2) {
            return 0;
        }

        //Main Logic
        int temp = countaaa1(str, index+1);

        if(str.charAt(index) =='a' && str.charAt(index+1) =='a' && str.charAt(index+2) =='a') {
            return temp+1;
        } else {
            return temp;
        }
    }

    public static int countaaa2(String str, int index) {
        //Base case
        if (index >= str.length()-2) {
            return 0;
        }

        //Main Logic
        if(str.charAt(index) == 'a' && str.charAt(index+1) == 'a' && str.charAt(index+2) == 'a') {
            int temp = countaaa2(str, index+3);
            return temp+1;
        } else {
            int temp = countaaa2(str, index+1);
            return temp;
        }
    }
}
