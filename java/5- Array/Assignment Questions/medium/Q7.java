public class Q7 {
    public static void main(String[] args) {

        int[] nums = { 4, 2, 0, 0, 1, 1, 4, 4, 4, 0, 4, 0 };

        // int start = 0;
        // while (start < nums.length - 1) {
        // if (nums[start] == 0) {
        // // return false;
        // System.out.println("false");
        // }
        // if (nums[start] + start >= nums.length - 1) {
        // // return true;
        // System.out.println("true");
        // }
        //
        // int maxElement = 0;
        // int index = start;
        // for (int i = start + 1; i <= nums[start] + start; i++) {
        // if (nums[i] >= maxElement) {
        // maxElement = nums[i];
        // index = i;
        // }
        // }
        // start = index;
        // }

        // return true;

        int maxReact = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > maxReact) {
                System.out.println(false);
            }

            maxReact = Math.max(maxReact, i + nums[i]);

            if (maxReact >= nums.length - 1) {
                System.out.println(true);

            }
        }

        System.out.println(false);
    }
}
