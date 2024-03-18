public class Q643 {

    public static void main(String[] args) {
        int[] nums = { 5 };
        int k = 1;

        int total = 0;
        int maximum = 0;

        for (int i = 0; i < k; i++) {
            maximum += nums[i];
        }
        total = maximum;

        int l = 0;
        int r = k;
        while (r < nums.length) {
            total += nums[r] - nums[l];
            maximum = Math.max(maximum, total);
            l++;
            r++;
        }

        System.out.println(maximum);
        System.out.println((double) maximum / 4);
    }
}