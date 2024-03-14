public class Q9 {

    public static long check(long a, int index, int n) {

        long leftOffset = Math.max(a - index, 0);
        long result = (a + leftOffset) * (a - leftOffset + 1) / 2;
        long rightOffset = Math.max(a - ((n - 1) - index), 0);
        result += (a + rightOffset) * (a - rightOffset + 1) / 2;
        return result - a;
    }

    public static void main(String[] args) {
        int n = 4, index = 2, maxSum = 6;
        maxSum -= n;

        int s = 0;
        int e = maxSum;

        while (s < e) {
            int mid = (s + e + 1) / 2;

            if (check(mid, index, n) <= maxSum) {
                s = mid;
            } else {
                e = mid - 1;
            }

        }

        System.out.println(s + 1);
    }
}
