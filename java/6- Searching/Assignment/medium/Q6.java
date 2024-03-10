public class Q6 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };

        int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] > nums[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }

        }
        System.out.println(s);
    }
}
