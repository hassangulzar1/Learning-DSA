import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            int sum = 0;
            for (int j = 0; j < ans.length; j++) {
                if (nums[i] > nums[j]) {
                    sum++;
                }
            }
            ans[i] = sum;
            sum = 0;
        }

        System.out.println(Arrays.toString(ans));
    }
}
