import java.util.Scanner;

public class RowWiseMatrix {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int row = scn.nextInt();
        int col = scn.nextInt();

        int[][] arr = new int[row][col];

        //Take input from user (By default row wise)
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        printRowWiseMatrix(arr, row, col);
    }

    public static void printRowWiseMatrix(int[][] arr, int row, int col) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
