import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length / 2; i++) {
            ans[i + i] = nums[i];
            ans[i + i + 1] = nums[i + n];
        }

        System.out.println(Arrays.toString(ans));
    }
}
