import java.util.Scanner;

public class FloorValue {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] nums = new int[size];

        for(int i = 0; i < size; i++) {
            nums[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        System.out.println(floor(nums, k));
    }

    public static int floor(int[] nums, int k) {
        int ans = Integer.MIN_VALUE;
        int low = 0;
        int high = nums.length-1;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if (nums[mid] == k) {
                return k;
            } else if(nums[mid] < k) {
                if (nums[mid] > ans) {
                    ans = nums[mid];
                }
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return ans;
    }
}
