import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 4 };
        // int[] ans = new int[nums.length];
        // int[] output = new int[nums.length];
        // int[] result = new int[nums.length];
        //
        // int leftPro = 1;
        // ans[0] = 1;
        // for (int i = 0; i < ans.length - 1; i++) {
        // leftPro *= nums[i];
        // ans[i + 1] = leftPro;
        // }
        //
        // int rightPro = 1;
        // output[0] = 1;
        // for (int i = nums.length - 1; i > 0; i--) {
        // rightPro *= nums[i];
        // output[(nums.length - 1) - i + 1] = rightPro;
        // }
        //
        // for (int i = 0; i < output.length; i++) {
        // result[i] = ans[i] * output[(nums.length - 1) - i];
        // }

        // ! optimising that solution
        // int[] nums = { 1, 2, 3, 4 };
        // int[] ans = new int[nums.length];
        // int[] output = new int[nums.length];
        //
        // int leftPro = 1;
        // ans[0] = 1;
        // for (int i = 0; i < ans.length - 1; i++) {
        // leftPro *= nums[i];
        // ans[i + 1] = leftPro;
        // }
        //
        // int rightPro = 1;
        // output[0] = 1;
        // for (int i = nums.length - 1; i > 0; i--) {
        // rightPro *= nums[i];
        // output[(nums.length - 1) - i + 1] = rightPro;
        // }
        //
        // for (int i = 0; i < nums.length; i++) {
        // nums[i] = ans[i] * output[(nums.length - 1) - i];
        // }

        // ! more optimised code
        int[] nums = { 1, 2, 3, 4 };
        int[] output = new int[nums.length];

        int product = 1;
        for (int i = 0; i < output.length; i++) {
            output[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= product;
            product *= nums[i];
        }
        System.out.println(Arrays.toString(output));
    }
}
