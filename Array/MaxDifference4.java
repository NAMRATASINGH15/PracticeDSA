import java.util.Scanner;

public class MaxDifference4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int ans2 = maxDifference2(arr);
        int ans3 = maxDifference3(arr);

        int ans4 = Math.max(ans2, ans3);
        System.out.println(ans4);
    }

    public static int maxDifference2(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + i;
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

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - i;
        }
        return max - min;
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

/*
Given n length array "arr". Find (i,j) with maximum value of (abs(arr[i] - arr[j]) + i - j). You need to print max value of (abs(arr[i] - arr[j]) + i - j) possible and not the (i,j) itself.

Note 1: abs represents the postive part only. ex: abs(8) = 8 and abs(-8) = 8.

Note 2: Doing it by checking all the possible pairs. Works but can you do something smart?
Input Format

Each of the test cases have 2 lines.
The First line contains the size of the array n.
The second line contains the n elements of the array.
Constraints

2 <= array length <= 10^5
-10^4 <= array[i] <= 10^4
Output Format

Print the maximum value of (abs(arr[i] - arr[j]) + i - j) Possible.
Sample Input 0

5
3 9 8 4 1
Sample Output 0

11
*/
