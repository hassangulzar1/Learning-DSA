public class Q1 {
    public static int binarySearch(int[] arr, int target, boolean first) {

        int s = 0;
        int e = arr.length - 1;

        int ifPossible = -1;
        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                if (first) {
                    ifPossible = mid;
                    e = mid - 1;
                } else {
                    ifPossible = mid;
                    s = mid + 1;
                }

            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ifPossible;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;

        int firstPos = binarySearch(nums, target, true);

        // if (firstPos == -1) {
        // return new int[] { -1, -1 };
        // }
        int secondPos = binarySearch(nums, target, false);

        System.out.println(secondPos);
    }

}
