public class Q11 {
    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 10, 8 };
        int k = 2;
    }

    public int splitArray(int[] nums, int k) {
        int s = 0;
        int e = 0;

        for (int i = 0; i < nums.length; i++) {
            s = Math.max(s, nums[i]); // in the end of the loop this will contain max item of array
            e += nums[i];
        }

        // binary search

        while (s < e) {

            int mid = s + (e - s) / 2;

            int sum = 0;
            int pices = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pices++;

                } else {
                    sum += num;
                }
            }

            if (pices > k) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        return e;
    }
}
