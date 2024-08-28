import java.util.Scanner;

public class Factorial {
    public static int fact(int n) {
        //Base Case
        if (n == 0) {
            return 1;
        }

        //Main logic
        int ans = fact(n-1);
        return ans * n;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(fact(n));
    }
}
