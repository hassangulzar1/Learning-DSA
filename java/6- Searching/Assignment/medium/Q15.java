import java.util.Arrays;

public class Q15 {
    public static void main(String[] args) {

        int[] nums = { 2, 5, 9, 6, 9, 3, 8, 9, 7, 1 };

        int s = 1;
        int e = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            int count = 0;
            for (int i : nums) {
                if (i <= mid) {
                    count++;
                }
            }
            if (count > mid) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        System.out.println(s);

    }

}
