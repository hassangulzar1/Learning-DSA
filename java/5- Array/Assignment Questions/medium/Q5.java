import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] ans = new int[nums.length];

        int i = 0;
        while (i < nums.length) {
            int leftPro = i == 0 ? 0 : 1;

            for (int j = 0; j < i; j++) {
                leftPro *= nums[j];
            }

            int righPro = i == nums.length - 1 ? 0 : 1;
            for (int j = i + 1; j <= ans.length - 1; j++) {
                righPro *= nums[j];

            }

            ans[i++] = righPro * leftPro;

        }
        System.out.println(Arrays.toString(ans));
    }
}
