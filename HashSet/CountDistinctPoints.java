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

/*
Given N 2D Points, Calculate no. of distinct points among them.

Ex: x[5] = {2, 1, 3, 2, 2}
    y[5] = {3, 1, 2, 3, 4}

The first array represents the x co-ordinates, the second array represents the y co-ordinate. Acoording to above examples the points are
    (x[0],y[0])->(2,3)
    (x[1],y[1])->(1,1)
    (x[2],y[2])->(3,2)
    (x[3],y[3])->(2,3)
    (x[4],y[4])->(2,4)

Total number of distinct points are 4.
Input Format

The first line contains an Integer n denoting number of points.
Second line contains n integer denoting the x-coordinates.
Third line contains another n integer denoting the y-coordinates.
Constraints

1<=n<=10^5
Output Format

Output the distinct points count
Sample Input 0

5
2 1 3 2 2
3 1 2 3 4
Sample Output 0

4
*/

