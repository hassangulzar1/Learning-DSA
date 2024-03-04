import java.util.ArrayList;
import java.util.Arrays;

public class Q11 {

    public static boolean binarySearch(int[] otherArr, int target) {

        int s = 0;
        int e = otherArr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (otherArr[mid] == target) {
                return true;
            } else if (otherArr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 2, 1 }, nums2 = { 2, 2 };

        // !fullBruteForce
        // ArrayList<Integer> ans = new ArrayList<>();
        // if (nums1.length <= nums2.length) {
        // Arrays.sort(nums2);
        // for (int i = 0; i < nums1.length; i++) {
        // if (binarySearch(nums2, nums1[i]) && !ans.contains(nums1[i])) {
        // ans.add(nums1[i]);
        // }
        // }
        //
        // } else {
        // Arrays.sort(nums1);
        //
        // for (int i = 0; i < nums2.length; i++) {
        // if (binarySearch(nums1, nums2[i]) && !ans.contains(nums2[i])) {
        // ans.add(nums2[i]);
        // }
        // }
        // }
        // int[] returnArr = new int[ans.size()];
        //
        // for (int i = 0; i < returnArr.length; i++) {
        // returnArr[i] = ans.get(i);
        // }
        // ! optimize solution
        int[] temp = new int[1001];
        int k = 0;
        for (int n : nums1) {
            temp[n] = 1;
        }

        for (int n : nums2) {
            if (temp[n] == 1) {
                temp[n] = 2;
                k++;
            }
        }

        int[] ans = new int[k];
        int index = 0;
        for (int n : nums2) {
            if (temp[n] == 2) {
                temp[n] = 1;
                ans[index] = n;
                index++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
