import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(printSum(arr));
    }

    public static int printSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
