import java.util.Scanner;

public class GoodIntegerBruteForce {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(count(arr));
    }

    public static int count(int[] arr) {
        int countGoodInteger = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    ++count;
                }
            }
            if (arr[i] == count) {
                countGoodInteger++;
            }
        }
        return countGoodInteger;
    }
}
