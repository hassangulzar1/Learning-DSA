import java.util.Arrays;

public class Q4 {
    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        int i = 0;
        //
        // while (i < nums.length) {
        // if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
        // swap(nums, i, nums[i]);
        // } else {
        // i++;
        // }
        // }
        // for (int j = 0; j < nums.length; j++) {
        // if (nums[j] != j) {
        // return j;
        //
        // }
        // }
        // return nums.length;
    }
}
