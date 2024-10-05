import java.util.Scanner;
import java.util.Arrays;

public class GoodIntegerDistinct {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(countGoodInteger(arr));
    }

    public static int countGoodInteger(int[] arr) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i){
                count++;
            }
        }

        return count;
    }
}
