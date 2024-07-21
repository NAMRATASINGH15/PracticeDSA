import java.util.Scanner;
import java.util.HashMap;

public class FirstNonRepetitiveElement {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(firstNonRepetitiveElement(arr));
    }

    public static int firstNonRepetitiveElement (int[] arr) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        //Frequency Map
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]) == false) {
                hm.put(arr[i],1);
            } else {
                int temp = hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }
        }

        //Iterate the array
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) == 1) {
                return arr[i];
            }
        }

        return -1;
    }
}

/*
* Input: arr[] = {1, 2, 3, 1, 2, 5}
* Output: 3
*/

