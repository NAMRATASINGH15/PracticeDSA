import java.util.Scanner;

public class CheckSorted {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(isSorted(arr, 0));
    }

    public static boolean isSorted(int[] arr, int idx) {

        // Base Case
        if (idx >= arr.length - 1) {
            return true;
        }

        //Main Logic
        if (arr[idx+1] >= arr[idx]) {
            boolean temp = isSorted(arr, idx+1);
            return temp;
        } else {
            return false;
        }
    }
}
