public class Q5 {
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

    static int findingRange(int[] arr, int target) {

        int start = 0;
        int end = 1;
        // ! condition
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);

    }

    public static void main(String[] args) {
        // First Finding the Range
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int target = 9;

        System.out.println(findingRange(arr, target));

    }
}
