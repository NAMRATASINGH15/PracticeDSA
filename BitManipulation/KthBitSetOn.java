import java.util.Scanner;

public class KthBitSetOn {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        System.out.println(setKthBitOn(n, k));
    }

    public static int setKthBitOn(int n, int k) {
        int ans = n | (1 << k);
        return ans;
    }
}
