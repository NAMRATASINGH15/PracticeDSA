import java.util.Scanner;
import java.util.Arrays;

public class GoodIntegerDuplicate {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(goodIntegerDuplicate(arr));
    }

    public static int goodIntegerDuplicate(int[] arr) {
        Arrays.sort(arr);

        int ans = 0;
        int lessCount = 0;

        if (arr[0] == 0) {
            ans++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                lessCount = i;
            }

            if (lessCount == arr[i]) {
                ans++;
            }
        }
        return ans;
    }
}
