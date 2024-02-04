import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        // int[] result = new int[nums.length];
        // for (int i = 0; i < result.length; i++) {
        // result[(i + k) % nums.length] = nums[i];
        // }
        //
        // for (int i = 0; i < result.length; i++) {
        // nums[i] = result[i];
        // }

        // ! Optimise solution
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
