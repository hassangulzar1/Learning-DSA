import java.util.Arrays;

public class Q27 {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int i = 0;
        int j = 1;
        while (j <= nums.length - 1 && i < nums.length - 1) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                int pos = i + 1;
                nums[pos] = nums[j];
                i++;
                j++;
            }

        }
        System.out.println(i + 1);
    }
}
