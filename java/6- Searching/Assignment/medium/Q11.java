import java.util.Arrays;

public class Q11 {
    public static int findClosest(int[] sortedNums, int target) {
        int left = 0, right = sortedNums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (sortedNums[mid] == target)
                return target;
            else if (sortedNums[mid] < target)
                left = mid + 1;
            else
                right = mid;
        }
        if (left > 0 && Math.abs(sortedNums[left] - target) > Math.abs(sortedNums[left - 1] - target))
            return sortedNums[left - 1];
        return sortedNums[left];

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 10, 4, 4, 2, 7 }, nums2 = { 9, 3, 5, 1, 7, 4 };

        int mod = 1000000007;

        int n = nums1.length;
        int[] sortedNums1 = nums1.clone();
        Arrays.sort(sortedNums1);

        int sumDiff = 0;
        for (int i = 0; i < n; i++) {
            sumDiff = (sumDiff + Math.abs(nums1[i] - nums2[i])) % mod;
        }

        int minDiff = sumDiff;

        for (int i = 0; i < n; i++) {
            int originalValue = nums1[i];
            int closestValue = findClosest(sortedNums1, nums2[i]);
            int newDiff = (sumDiff - Math.abs(originalValue - nums2[i]) + Math.abs(closestValue - nums2[i])) % mod;
            minDiff = Math.min(minDiff, newDiff);
        }

        System.out.println(minDiff);

    }
}
