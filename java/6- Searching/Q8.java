public class Q8 {
    static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid < e && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > s && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] <= arr[s]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        int[] nums = { 3, 4, 5, 6, 1, 2 };
        int target = 0;
        int pivot = findPivot(nums);

        int findLeft = binarySearch(nums, target, 0, pivot);
        if (findLeft != -1) {
            // return findLeft;
        }

        // return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
}
