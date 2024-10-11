import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int array_size = scn.nextInt();
        int[] nums = new int[array_size];

        for (int i = 0; i < array_size; i++){
            nums[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        System.out.println(binarySearch(nums, target));
    }

    public static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while (low <= high) {
            int mid = low + (high - low)/2;
            if (nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }
}
