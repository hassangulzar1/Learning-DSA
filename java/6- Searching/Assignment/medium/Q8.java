public class Q8 {

    public static void main(String[] args) {

        int target = 2;

        if (target < 0) {
            target *= -1;
        }

        int s = 1;
        int e = target;
        int steps = 0;
        long pos = 0;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            long sum = (long) mid * (mid + 1) / 2;

            if (sum >= target) {
                pos = sum;
                steps = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }

        int diff = (int) (pos - target);

        if (diff % 2 != 0) {
            if ((steps + 1) % 2 != 0) {
                steps += 1;
            } else {
                steps += 2;
            }

        }

    }
}