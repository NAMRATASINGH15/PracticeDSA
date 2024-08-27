import java.util.Scanner;

public class FirstNNaturalNumbersSum {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }

        int temp = sum(n-1);
        return temp + n;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(sum(n));
    }
}
