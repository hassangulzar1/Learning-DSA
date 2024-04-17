public class Q5 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1 };

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i : nums) {
            if (i > first) {
                third = second;
                second = first;
                first = i;
            } else if (first > i && i > second) {
                third = second;
                second = i;
            } else if (second > i && i > third) {
                third = i;
            }
        }

        System.out.println(third == Long.MIN_VALUE ? (int) first : (int) third);
    }
}
