import java.util.Scanner;

public class FirstIndex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        int key = scn.nextInt();

        System.out.println(firstIndex(arr, 0, key));
    }

    public static int firstIndex(int[] arr, int idx, int key) {
        if (idx > arr.length-1) {
            return -1;
        }

        if (key == arr[idx]) {
            return idx;
        }

        int temp = firstIndex(arr, idx+1, key);

        return temp;
    }
}
