public class Q24 {
    public static void main(String[] args) {
        int[] nums = { -1 };

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }

        }

        System.out.println(max);
    }
}
