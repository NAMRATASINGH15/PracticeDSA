import java.util.Scanner;

public class TwoSumBruteForce {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size  = scn.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        System.out.println(twoSum(arr, k));
    }

    public static boolean twoSum(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}

/*
* Given N array elements, check if there exists a pair (i,j) such that arr[i] + arr[j] = k and i != j
* Input1: arr[] = {2, -1, 0, 3, 2, 5, 7} k=8
* Output: true
* Input2: arr[] = {1, 3, -2, 6} k=5
* Output: false
*/

