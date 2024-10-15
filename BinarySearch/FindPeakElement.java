import java.util.Scanner;

public class FindPeakElement {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int array_size = scn.nextInt();

        int[] nums = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            nums[i] = scn.nextInt();
        }

        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        //If there is only an element in an array
        if (nums.length == 1) {
            return 0;
        }

        //if 0th index element is greater than first index element
        if (nums[0] > nums[1]) {
            return 0;
        }

        //if last index element is greater than second last index element
        if(nums[nums.length-1] > nums[nums.length-2]) {
            return nums.length-1;
        }

        int low = 1;
        int high = nums.length-2;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {
                return mid;
            } else if (nums[mid-1] > nums[mid]) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }

}
