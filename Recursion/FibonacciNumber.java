import java.util.Scanner;

public class FibonacciNumber {

    public static int fib(int n) {
        //Base Case
        if (n == 0 || n == 1) {
            return n;
        }

        //Main logic
        int temp1 = fib(n-1);
        int temp2 = fib(n-2);

        return temp1 + temp2;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(fib(n));
    }
}
