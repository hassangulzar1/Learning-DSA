public class Q5 {

    public static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (mid > s && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            } else if (mid < e && arr[mid + 1] < arr[mid]) {
                return mid;
            } else if (arr[mid] < arr[s]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return s;
    }

    public static void main(String[] args) {
        int[] nums = { 11, 13, 15, 17 };

        if (nums[0] < nums[nums.length - 1]) {
            System.out.println(nums[0]);

        }

        int lowestElement = findPivot(nums);

        System.out.println(nums[lowestElement + 1]);
    }
}
