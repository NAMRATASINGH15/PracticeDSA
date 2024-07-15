import java.util.Scanner;

public class EvenOdd {

    public static void checkEvenOdd (int num) {

        if ((num & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        checkEvenOdd(num);
    }
}
