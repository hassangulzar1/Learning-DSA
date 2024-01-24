import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };

        // ! BruteForce solution
        // int[] ans = new int[nums.length];
        // for (int i = 0; i < ans.length; i++) {
        // int sum = 0;
        // for (int j = 0; j < ans.length; j++) {
        // if (nums[i] > nums[j]) {
        // sum++;
        // }
        // }
        // ans[i] = sum;
        // }

        // ! Optimise solution
        int[] ans = new int[101];

        for (int i = 0; i < nums.length; i++) {
            ans[nums[i]] += 1;
        }

        for (int j = 1; j <= 100; j++) {
            ans[j] += ans[j - 1];
        }

        for (int k = 0; k < nums.length; k++) {
            int pos = nums[k];
            nums[k] = pos == 0 ? 0 : ans[pos - 1];
        }

        System.out.println(Arrays.toString(nums));
    }
}
