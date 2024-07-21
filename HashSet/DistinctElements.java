import java.util.Scanner;
import java.util.HashSet;

public class DistinctElements {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(distinctElements(arr));
    }

    public static int distinctElements(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        return hs.size();
    }
}

/* Find distinct elements
* Input: arr[] = {4, 6, 7, 6, 5};
* Output: 4
*/
