public class Q6 {

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int firstIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                firstIndex = i;
                break;
            }
        }
        int lastIndex = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                lastIndex = i;
                break;
            }
        }

    }
}
