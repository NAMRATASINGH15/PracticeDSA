import java.util.Scanner;

public class UniqueElement {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int size = scn.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(uniqueElement(arr));
    }

    public static int uniqueElement(int[] arr) {
        //Brute force         5 6 7 6 5

        for (int i = 0; i < arr.length-1; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
            }

            if (count == 0) {
                return arr[i];
            }
        }
        return -1;
    }
}
