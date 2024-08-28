import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintIncreasing {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printIncreasing(n);
    }

    public static void printIncreasing (int n) {
        //Base Case
        if (n == 1) {
            System.out.println(n);
            return;
        }

        //Main logic
        printIncreasing(n-1);
        System.out.println(n);
    }
}
