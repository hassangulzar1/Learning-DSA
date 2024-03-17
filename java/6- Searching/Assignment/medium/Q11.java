import java.util.Arrays;

public class Q11 {

    public static int leftIndex(int[] arr, int key) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] >= key) {
                e = mid;

            } else {
                s = mid + 1;
            }

        }
        return s;
    }

    public static int rightIndex(int[] arr, int key) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] > key) {
                e = mid;

            } else {
                s = mid + 1;
            }

        }
        return s - 1;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 10, 4, 4, 2, 7 }, nums2 = { 9, 3, 5, 1, 7, 4 };

        double mod = 1e9 + 7;

        int n = nums1.length;
        int[] sortedNums1 = nums1.clone();
        Arrays.sort(sortedNums1);

        double sum = 0;
        for (int i = 0; i < n; i++) {
            int originlDiff = Math.abs(nums1[i] - nums2[i]);
            sum += originlDiff;
        }

        double result = sum;

        for (int j = 0; j < n; j++) {
            int leftIndex = leftIndex(sortedNums1, nums2[j]) == nums2.length ? leftIndex(sortedNums1, nums2[j]) - 1
                    : leftIndex(sortedNums1, nums2[j]);
            int rightIndex = rightIndex(sortedNums1, nums2[j]) < 0 ? 0 : rightIndex(sortedNums1, nums2[j]);
            int newDiff = Math.min(Math.abs(nums2[j] - sortedNums1[leftIndex]),
                    Math.abs(nums2[j] - sortedNums1[rightIndex]));

            result = Math.min(result, sum - Math.abs(nums1[j] - nums2[j]) + newDiff);
        }
        System.out.println((int) (result % mod));
        // return ;
    }
}
