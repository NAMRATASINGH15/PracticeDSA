import java.util.Scanner;

public class RotateArrayByKTimes {

    //TODO: Write the program using brute force approach
    public static void rotateArray(int[] arr, int k) {
        /*
            arr[7] = {3, -2, 1, 4, 6, 9, 8}, k = 3
            O/P: arr[7] = {6, 9, 8, 3, -2, 1, 4}
        */

        if (arr.length == 0) {
            return;
        }

        while (k > 0) {
            int temp = arr[arr.length-1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i-1];
            }

            arr[0] = temp;
            k--;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int size = scn.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        //BruteForce approach
        rotateArray(arr, k);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
