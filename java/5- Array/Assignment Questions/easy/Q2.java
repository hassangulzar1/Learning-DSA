import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 1 };
        int[] ans = new int[nums.length * 2];

        // ! brute force approch
        // for (int i = 1; i <= ans.length; i++) {
        // if (i > ans.length / 2) {
        // ans[i - 1] = nums[(i - ans.length / 2) - 1];
        //
        // } else {
        // ans[i - 1] = nums[i - 1];
        // }
        // }

        // ! Optimize solution approch
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        // System.gc();
        System.out.println(Arrays.toString(ans));
    }
}
