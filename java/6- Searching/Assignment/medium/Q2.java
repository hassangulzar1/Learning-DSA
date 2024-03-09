public class Q2 {
    public static void main(String[] args) {

        int[] nums = { 1, 1, 2, 3, 3 };

        int s = 0;
        int e = nums.length - 1;

        int length = nums.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                System.out.println(nums[mid]);
                break;
            } else if (nums[mid - 1] == nums[mid]) {
                int target = length - mid;

                if (target % 2 == 0) {
                    e = mid - 2;
                } else {
                    s = mid + 1;
                }

            } else if (nums[mid + 1] == nums[mid]) {
                int target = length - mid + 1;

                if (target % 2 == 0) {
                    e = mid - 1;
                } else {
                    s = mid + 2;
                }
            }

        }

        System.out.println(s);
    }
}
