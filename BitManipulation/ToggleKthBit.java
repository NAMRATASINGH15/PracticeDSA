import java.util.Scanner;

public class ToggleKthBit {

    /* N = 20  => 1 0 1 0 0  and k = 3 (from right side)
    *  ans = 1 0 0 0 0 => ans = 16
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        System.out.println(toggleKthBit(n,k));
    }

    public static int toggleKthBit (int n, int k) {
        int ans = n ^ (1 << (k-1));
        return ans;
    }
}
