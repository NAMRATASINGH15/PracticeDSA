import java.util.Scanner;

public class UniqueElementOptimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] arr) {
        int ans  = 0;

        for (int i = 0; i < arr.length; i++) {
            ans  = ans ^ arr[i];
        }
        return ans;
    }
}
