import java.util.Arrays;

public class Q287 {
    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };

        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);

            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
