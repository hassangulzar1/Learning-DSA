public class Q9 {
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

            if (arr[s] == arr[mid] && arr[e] == arr[mid]) {
                // ! skip the duplicates
                if (arr[s] > arr[s + 1]) {
                    return s;
                }
                s++;

                if (arr[e] < arr[e - 1]) {
                    return e - 1;
                }
                e--;
            } else if (arr[s] < arr[mid] || (arr[s] == arr[mid] && arr[e] < arr[mid])) {
                s = mid + 1;
            } else {
                e = mid - 1;
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
        System.out.println(pivot);
        int findLeft = binarySearch(nums, target, 0, pivot);
        if (findLeft != -1) {
            // return findLeft;
        }

        // return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
}
