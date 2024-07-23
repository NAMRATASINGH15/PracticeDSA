import java.util.Scanner;
import java.util.HashMap;

public class CountRightAngledTriangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //Declaration of 2D array
        int[][] arr = new int[n][2];

        //Initialization of 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println(rightAngledTriangle(arr, n));
    }

    public static int rightAngledTriangle (int[][] arr, int n) {
        HashMap<Integer,Integer> xpoints = new HashMap<>();
        HashMap<Integer,Integer> ypoints = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (xpoints.containsKey(arr[i][0])) {
                xpoints.put(arr[i][0],xpoints.get(arr[i][0])+1);
            } else {
                xpoints.put(arr[i][0],1);
            }

            if (ypoints.containsKey(arr[i][1])) {
                ypoints.put(arr[i][1],ypoints.get(arr[i][1])+1);
            } else {
                ypoints.put(arr[i][1],1);
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (xpoints.get(arr[i][0]) >= 1 && ypoints.get(arr[i][1]) >= 1) {
                count += (xpoints.get(arr[i][0])-1) * (ypoints.get(arr[i][1])-1);
            }
        }

        return count;
    }
}
