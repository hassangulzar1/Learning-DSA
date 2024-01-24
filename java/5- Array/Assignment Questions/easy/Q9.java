import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };

        int[] ans = new int[nums.length];

        int j = ans.length - 2;
        int i = 0;
        while (i < ans.length && j > 0) {
            ans[j + 1] = nums[j--];
            ans[j - 1] = ans[j + 1];
            ans[index[i]] = nums[i++];
        }

        System.out.println(Arrays.toString(ans));

    }
}
