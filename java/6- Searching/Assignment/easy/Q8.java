public class Q8 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 2;

        int s = 0;
        int e = nums.length - 1;
        int isPossible = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                System.out.println(mid);
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        System.out.println(s);
    }
}
