import java.util.Scanner;

public class RotateArrayByKTimesFromRightOptimal {

    public static void rotateFromRight(int[] arr, int k) {

        //TODO: Reverse from 0 to size-1
        reverse (arr, 0 , arr.length-1);

        //TODO: Reverse from 0 to k-1
        reverse (arr, 0, k-1);

        //TODO: Reverse from k to arr.length-1
        reverse (arr, k, arr.length-1);
    }

    //TODO: Write a function to reverse the array
    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int size = scn.nextInt();

        int[] arr = new int[size];
        for (int  i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        k = k % size;

        rotateFromRight(arr, k);

        //TODO: Access array elements
        for (int v : arr) {
            System.out.print(v + " ");
        }
    }
}
