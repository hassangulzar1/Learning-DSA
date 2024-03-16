import java.util.Arrays;

public class Q11 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 10, 4, 4, 2, 7 }, nums2 = { 9, 3, 5, 1, 7, 4 };

        int subtract = 0;

        int maxiIndex = -1;
        int val = Integer.MIN_VALUE;

        for (int i = 0; i < nums1.length; i++) {
            int subtractValue = Math.abs(nums1[i] - nums2[i]);
            subtract += subtractValue;

            if (subtractValue > val) {
                val = subtractValue;
                maxiIndex = i;
            }

        }

        Arrays.sort(nums1);
        subtract = subtract - val;
        int s = 0;
        int e = nums1.length - 1;

        // System.out.println(maxiIndex);
        // System.out.println(val);

        while (s < e) {
            int mid = s + (e - s) / 2;

            int sub = Math.abs(nums2[maxiIndex] - nums1[mid]);

            int checkFront = Math.abs(nums2[maxiIndex] - nums1[mid + 1]);
            if (sub < val && checkFront < val) {
                val = sub;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        int ans = Math.abs(nums1[s] - nums2[maxiIndex]);

        System.out.println(subtract + ans);
    }
}
