public class Q10 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 9, 3, 1 };

        int rob = 0;
        int noRob = 0;

        for (int i = 0; i < nums.length; i++) {
            int newRob = noRob + nums[i];
            int noNewRob = Math.max(rob, noRob);
            rob = newRob;
            noRob = noNewRob;

        }

        System.out.println(Math.max(rob, noRob));
    }
}
