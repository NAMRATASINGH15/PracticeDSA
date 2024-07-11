import java.util.Scanner;

public class RotateArrayByKTimesFromLeft {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int size = scn.nextInt();
        k = k % size;

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        rotateFromLeft(arr, k);

        for (int v : arr) {
            System.out.print(v + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end) {

        int sp = start;
        int ep = end;
        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }

    public static void rotateFromLeft(int[] arr, int k) {

//        while (k > 0) {
//            int temp = arr[0];
//
//            for (int i = 0; i < arr.length - 1; i++) {
//                arr[i] = arr[i+1];
//            }
//
//            arr[arr.length-1] = temp;
//            k--;
//        }

        //TODO: Optimal approach
        //TODO: 1st rotation [0, size-1]
        reverse(arr, 0, arr.length-1);

        //TODO: 2nd rotation [k+1, arr.length-1]
        reverse(arr, k, arr.length-1);

        //TODO: 3rd rotation [0, k]
        reverse(arr, 0, k-1);
    }
}
