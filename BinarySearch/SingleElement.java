import java.util.Scanner;

public class SingleElement {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = scn.nextInt();
        }

        System.out.println(singleElement(nums));
    }

    public static int singleElement(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        if(nums[0] != nums[1]) {
            return nums[0];
        }

        if (nums[nums.length-1] != nums[nums.length-2]) {
            return nums[nums.length-1];
        }

        int low = 2;
        int high = nums.length -3;

        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) {
                return nums[mid];
            }

            if (nums[mid] == nums[mid-1]) {
                mid--;
            }
            if(mid % 2 == 0) {
                low = mid+2;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }
}
