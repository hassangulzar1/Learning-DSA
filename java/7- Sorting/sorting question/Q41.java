import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q41 {
    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 1 };

        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] > 0 ? nums[i] - 1 : nums[i];

            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                // return j + 1;
                System.out.println(j + 1);
            }
        }
        System.out.println(nums.length + 1);
    }
}
