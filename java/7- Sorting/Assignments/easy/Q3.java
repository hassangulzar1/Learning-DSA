import java.util.Arrays;

public class Q3 {
    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        // ! BruteForce solution
        // Arrays.sort(nums);
        //
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] == nums[j]) {
        // return true;
        // }
        // }
        // }
        // return false;

    }
}
