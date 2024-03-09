public class Q4 {
    public static boolean binarySearch(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return true;

            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return false;

    }

    public static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[s] == arr[s + 1]) {
                s++;
            } else if (arr[e] == arr[e - 1]) {
                e--;
            } else if (mid > s && arr[mid - 1] > arr[mid]) {
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

        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 3;

        int pivotElement = findPivot(nums);

        boolean findFirst = binarySearch(nums, target, 0, pivotElement);

        if (!findFirst) {
            boolean second = binarySearch(nums, target, pivotElement + 1, nums.length - 1);
            System.out.println(second);
        }

        System.out.println(findFirst);
    }
}
