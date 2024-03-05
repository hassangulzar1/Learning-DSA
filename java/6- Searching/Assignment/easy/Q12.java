import java.util.ArrayList;
import java.util.Arrays;

public class Q12 {
    public static int binarySearch(int[] arr, int target, int st) {

        int s = st;
        int e = arr.length - 1;

        int ifPossible = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= target) {
                ifPossible = mid;
                s = mid + 1;

            } else {
                e = mid - 1;
            }
        }

        return ifPossible;
    }

    public static void main(String[] args) {

        int[] nums1 = { 4, 9, 5 }, nums2 = { 9, 4, 9, 8, 4 };

        // ! Brute Force solution
        // Arrays.sort(nums2);
        // Arrays.sort(nums1);
        // ArrayList<Integer> temp = new ArrayList<>();
        //
        // int i = 0;
        // int j = 0;
        // while (i < nums1.length && j < nums2.length) {
        //
        // if (nums1[i] < nums2[j]) {
        // i++;
        // } else if (nums1[i] > nums2[j]) {
        // j++;
        // } else {
        // temp.add(nums1[i]);
        // i++;
        // j++;
        // }
        // }
        //
        // int[] ans = new int[temp.size()];
        //
        // for (int k = 0; k < ans.length; k++) {
        //
        // ans[k] = temp.get(k);
        //
        // }
        //
        // System.out.println(ans);

        // ! Optimise solution
        int[] temp = new int[1001];

        for (int n : nums1) {
            temp[n]++;
        }

        int k = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (temp[nums2[i]] > 0) {
                nums1[k++] = nums2[i];
                temp[nums2[i]]--;
            }

        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(nums1, 0, k)));

    }
}
