import java.util.Arrays;

public class Q238 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };

        int[] output = new int[nums.length];
        int preFix = 1;
        for (int i = 0; i < output.length; i++) {
            output[i] = preFix;
            preFix *= nums[i];
        }
        preFix = 1;
        for (int i = output.length - 1; i >= 0; i--) {
            output[i] *= preFix;
            preFix *= nums[i];
        }
    }
}
