import java.util.Scanner;

public class ReverseAPart {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int startIndex = scn.nextInt();
        int endIndex = scn.nextInt();

        //call reverse method
        reverse(arr, startIndex, endIndex);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr, int startIndex, int endIndex) {
        int start = startIndex;
        int end = endIndex;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
