import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(pow(a,n));
    }

    public static int pow(int a, int n) {
        if (n == 1) {
            return a;
        }

        int temp = pow(a, n-1);
        return temp*a;
    }
}
