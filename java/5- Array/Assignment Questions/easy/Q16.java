public class Q16 {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int numberCount = 0;

            while (nums[i] != 0) {
                nums[i] /= 10;
                numberCount++;
            }
            if (numberCount % 2 == 0)
                count++;

        }

        // ! Optimise Solution
        // for (int num : nums) {
        // if ((int) Math.log10(num) % 2 == 1)
        // count++;
        // }

        System.out.println(count);
    }
}
