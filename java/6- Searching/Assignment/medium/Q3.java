public class Q3 {
    public static int binarySearch(int[] arr, int target, int s, int e) {

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;

            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

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
        int[] nums = { 4, 5, 6, 7, 8, 0, 1, 2 };
        int target = 0;

        int pivotElement = findPivot(nums);

        int findFirst = binarySearch(nums, target, 0, pivotElement);

        if (findFirst == -1) {
            int second = binarySearch(nums, target, pivotElement + 1, nums.length - 1);
            System.out.println(second);
        }

    }
}
