import java.util.Scanner;

public class MaxDifference3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(maxDifference3(arr));
    }

    public static int maxDifference3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - i;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return max - min;
    }
}
