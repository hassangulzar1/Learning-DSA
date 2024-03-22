import java.util.Arrays;

public class Q14 {
    public static boolean ifPossible(int[] nums, int mid, int k) {
        long windowSum = 0, totalSum = 0;

        for (int i = 0; i < mid; ++i)
            windowSum += nums[i];

        totalSum = 1L * nums[mid - 1] * mid;

        if (totalSum - windowSum <= k)
            return true;

        int j = 0;
        for (int i = mid; i < nums.length; ++i) {
            windowSum -= nums[j];
            windowSum += nums[i];
            totalSum = 1L * nums[i] * mid;

            if (totalSum - windowSum <= k)
                return true;
            j++;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4 };
        int k = 5;

        Arrays.sort(nums);

        int s = 1;
        int e = nums.length;

        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (ifPossible(nums, mid, k)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }

        }

        System.out.println(ans);
    }
}