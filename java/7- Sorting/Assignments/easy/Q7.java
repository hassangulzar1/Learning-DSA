public class Q7 {
    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

    }

    public static int getMaxIndex(int[] arr, int s, int e) {
        int max = s;

        for (int i = s; i <= e; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { -1, -2, -3 };

        int ans = 1;
        for (int i = 0; i < 3; i++) {
            int last = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, last);
            ans *= nums[maxIndex];
            swap(nums, maxIndex, last);
        }
        System.out.println(ans);
    }
}
