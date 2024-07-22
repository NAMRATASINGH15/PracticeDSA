import java.util.Scanner;
import java.util.HashSet;

public class CountDistinctPoints {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = scn.nextInt();
        }

        for (int i = 0; i < n; i++) {
            y[i] = scn.nextInt();
        }

        System.out.println(countDistinctPoints(x, y));
    }

    public static int countDistinctPoints (int[] x, int[] y) {
        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < x.length; i++) {
            hs.add(x[i] + " " + y[i]);
        }
        return hs.size();
    }
}
