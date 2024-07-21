import java.util.Scanner;
import java.util.HashMap;

public class FindFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ele_size = scn.nextInt();
        int query_size = scn.nextInt();

        int[] arr = new int[ele_size];
        int[] queries = new int[query_size];

        for (int i = 0; i < ele_size; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < query_size; i++) {
            queries[i] = scn.nextInt();
        }

        int[] res = findFrequency(arr, queries);

        //Print the result array
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] findFrequency(int[] arr, int[] queries) {
        //Create the frequency map
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]) == false) {
                hm.put(arr[i], 1);
            } else {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp+1);
            }
        }

        //Create the ans array to store frequency of queries array element
        int[] ans = new int[queries.length];

        //Find the frequency of queries array element
        for (int i = 0; i < queries.length; i++) {
            if (hm.containsKey(queries[i]) == false) {
                ans[i] = 0;
            } else {
                ans[i] = hm.get(queries[i]);
            }
        }
        return ans;
    }
}

/*
* Given N array elements and Q queries. For every query find the frequency of elements in array.
* arr[11] = {2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6}
* queries[4] = {2, 8, 3, 5}
* OutPut: ans[4] = {3, 3, 2, 0}
*/
