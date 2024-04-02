import java.util.Arrays;

public class Q1 {
    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

    }

    public static void main(String[] args) {
        int[] nums1 = { 0 }, nums2 = { 1 };
        int m = 0, n = 1;

        int itr = 0;
        for (int i = 1; i <= n; i++) {

            nums1[m + i - 1] = nums2[itr];

            for (int j = m + itr; j > 0; j--) {

                if (nums1[j] < nums1[j - 1]) {
                    swap(nums1, j, j - 1);
                } else {
                    break;
                }
            }
            itr++;

        }

        System.out.println(Arrays.toString(nums1));
    }
}