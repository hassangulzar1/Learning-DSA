import java.util.Arrays;

public class Q9 {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };

        int l = 0;
        int r = nums.length - 1;

        for (int i = 0; i <= r;)
            if (nums[i] == 0)
                swap(nums, i++, l++);
            else if (nums[i] == 1)
                ++i;
            else
                swap(nums, i, r--);

        System.out.println(Arrays.toString(nums));
        // int[] count = new int[3];
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] == 0) {
        // count[0]++;
        // } else if (nums[i] == 1) {
        // count[1]++;
        // } else {
        // count[2]++;
        // }
        // }
        // int replace = 0;
        // for (int i = 0; i < count.length; i++) {
        // for (int j = 0; j < count[i]; j++) {
        // if (i == 0) {
        // nums[replace++] = i;
        // } else if (i == 1) {
        // nums[replace++] = i;
        // } else {
        // nums[replace++] = i;
        // }
        // }
        // }

    }

}
