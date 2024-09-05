import java.util.Scanner;

public class PowerOptimized {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(powOpt(a, n));
    }

    public static int powOpt(int a, int n) {
        if (n == 1) {
            return a;
        }

        int temp = powOpt(a, n/2);

        if (n % 2 == 0) {
            return temp * temp;
        } else  {
            return temp * temp * a;
        }
    }
}
