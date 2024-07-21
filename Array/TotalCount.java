import java.util.Scanner;

public class TotalCount {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(totalCount(arr));
    }

    public static int totalCount(int[] arr) {

        //Find maximum of the
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        //find the frequency of max element
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                maxCount++;
            }
        }

        return arr.length - maxCount;
    }
}
