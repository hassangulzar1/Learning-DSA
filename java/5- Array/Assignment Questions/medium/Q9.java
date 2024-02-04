import java.util.Arrays;

public class Q9 {
    public static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[start] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };

        // int start = 0;
        // int end = nums.length - 1;
        //
        // while (start < end) {
        // if (nums[start] == 2) {
        // swap(nums, start, end);
        // end--;
        // } else if (nums[end] == 2) {
        // end--;
        // }
        //
        // }

        int[] count = new int[3];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count[0]++;
            } else if (nums[i] == 1) {
                count[1]++;
            } else {
                count[2]++;
            }
        }
        int replace = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                if (i == 0) {
                    nums[replace++] = i;
                } else if (i == 1) {
                    nums[replace++] = i;
                } else {
                    nums[replace++] = i;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }

}
