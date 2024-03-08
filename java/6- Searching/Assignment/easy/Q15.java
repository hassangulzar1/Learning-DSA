import java.util.Arrays;

public class Q15 {

    public static int binarySearch(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int first_position = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (nums[mid] > target) {
                e = mid - 1;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else if (nums[mid] == target) {
                first_position = mid;
                e = mid - 1;
            }
        }
        return first_position == -1 ? s : first_position;
    }

    public static int LS(int[] arr, int k) {
        int count = 0;
        for (int n : arr) {
            if (n >= k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 5 };
        // Brute force solution
        // Arrays.sort(nums);
        // int s = 0;
        // int e = nums[nums.length - 1];
        // while (s <= e) {
        // int mid = (s + e) / 2;
        // int target = nums.length - binarySearch(nums, mid);
        // if (target == mid) {
        // System.out.println(mid);
        // // return mid;
        // } else if (target > mid) {
        // s = mid + 1;
        // } else {
        // e = mid - 1;
        // }
        // }
        // // return -1;
        // System.out.println(-1);

        // Optimise solution

        int start = 0;
        int end = nums.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (LS(nums, mid) < mid) {
                end = mid - 1;
            } else if (LS(nums, mid) > mid) {
                start = mid + 1;
            } else {
                // return mid;
                System.out.println(mid);
            }
        }
        // return -1;
        System.out.println(-1);
    }

}
