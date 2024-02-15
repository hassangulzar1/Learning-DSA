public class Q4 {
    static int Search(int[] arr, int target, boolean findStart) {
        int s = 0;
        int e = arr.length - 1;
        int possible = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                possible = mid;
                if (findStart) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }

            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }

        }
        return possible;
    }

    public static void main(String[] args) {

        int[] nums = { 5, 7, 7, 7, 8, 8, 10 };
        int target = 7;

        int start = Search(nums, target, true);
        int end = Search(nums, target, false);

        System.out.println(start);
        System.out.println(end);
    }
}
