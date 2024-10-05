import java.util.Arrays;
import java.util.Scanner;

public class OrderOfRemoval {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(orderOfRemoval(arr));
    }

    public static int orderOfRemoval(int[] arr) {
         Arrays.sort(arr);

         int cost = 0;
         for (int i = arr.length-1; i >= 0; i--) {
             cost += arr[i] * (arr.length - i);
         }
         return cost;
    }
}
