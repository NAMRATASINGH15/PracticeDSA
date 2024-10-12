import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        int target = x;
        int start = 0;
        int end = x;
        int mid = start + (end - start) / 2;
        int ans = -1;

        while (start <= end) {
            if (mid * mid == target) {
                return mid;
            } else if (mid * mid > target) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
                mid = start + (end - start) / 2;
            }
        return ans;
    }
}
