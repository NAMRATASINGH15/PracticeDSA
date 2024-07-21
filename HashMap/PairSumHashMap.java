import java.util.Scanner;
import java.util.HashMap;

public class PairSumHashMap {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int k = scn.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(pairSum(arr, k));
    }

    public static boolean pairSum(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]) == false) {
                hm.put(arr[i],1);
            } else {
                int temp = hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = k - a;

            if ((a != b) && hm.containsKey(b)) {
                return true;
            } else if ((a == b) && hm.get(b) >= 2) {
                return true;
            }
        }

        return false;
    }
}
/*
* Problem statement: Given an array arr[N], check if a pair(i,j) exists such that arr[i] + a[j] == k and (i != j)
* arr[10] = {8, 9, 1, -2, 4, 5, 11, -6, 7, 5}
* Input: k = 11
* Output: true
* Input: k = -4
* Output: false
* */