import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
